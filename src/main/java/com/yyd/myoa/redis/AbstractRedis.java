package com.yyd.myoa.redis;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.hash.BeanUtilsHashMapper;
import org.springframework.data.redis.hash.DecoratingStringHashMapper;
import org.springframework.data.redis.hash.HashMapper;
import org.springframework.data.redis.hash.JacksonHashMapper;
import org.springframework.util.LinkedMultiValueMap;

import com.yyd.myoa.model.UserInfo;

public abstract class AbstractRedis<E, K, V> {
	@Resource
	private RedisTemplate<K, V> redisTemplate;
	private Class<E> entityClass;
	private String region;

	public AbstractRedis() {
		Type c = (((ParameterizedType) getClass().getGenericSuperclass())
				.getActualTypeArguments()[0]);
		if (c instanceof ParameterizedType) {
			entityClass = (Class<E>) ((ParameterizedType) c).getRawType();
		} else {
			entityClass = (Class<E>) c;
		}
		region = entityClass.getSimpleName();
	}

	public Long setKey(String region) {
		return redisTemplate.opsForValue().increment((K) region, 1);
	}

	public void jackSet(V v) {
		Map<K, V> map = new JacksonHashMapper(entityClass).toHash(v);
		redisTemplate.boundHashOps((K) (region + ":H:" + setKey(region)))
				.putAll(map);
	};

	public E jackGet() {
		Map<K, V> map = (Map<K, V>) redisTemplate.boundHashOps(
				(K) (region + ":H:" + getKey())).entries();
		return (E) new JacksonHashMapper(entityClass).fromHash(map);
	}

	public List<E> list(List<String> keys) {
		List<E> lists = new ArrayList<E>();
		for (int i = 0; i < keys.size(); i++) {
			E e = (E) new JacksonHashMapper(entityClass).fromHash(redisTemplate
					.boundHashOps((K) keys.get(i)).entries());
			lists.add(e);
		}
		return lists;
	}

	public List<E> listConn(final List<String> keys) {
		List<E> es = new ArrayList<E>();
		List<Object> obj = redisTemplate.executePipelined(new RedisCallback<List<Object>>() {
			@Override
			public List<Object> doInRedis(RedisConnection connection)
					throws DataAccessException {
				Map<byte[], byte[]> map = new HashMap<byte[], byte[]>();
				for (int i = 0; i < keys.size(); i++) {
					byte[] key = redisTemplate.getStringSerializer().serialize(
							keys.get(i));
					map = connection.hGetAll(key);
				}
				return null;
			}
		});
		for (int i = 0; i < obj.size(); i++) {
			E e= (E) new JacksonHashMapper(entityClass).fromHash((Map) obj.get(i));
			es.add(e);
		}
		return es;
	}

	// public void set(V v) {
	// redisTemplate.boundHashOps((K) (region + ":H:" + setKey(region)))
	// .putAll(new BeanUtilsHashMapper(entityClass).toHash(v));
	// };
	//
	// public E getObj(List<Object> hkeys) {
	// return (E) new BeanUtilsHashMapper(entityClass).fromHash(redisTemplate
	// .boundHashOps((K) (region + ":H:" + getKey())).entries());
	// }

	public String getKey() {
		return (String) redisTemplate.boundValueOps((K) (region)).get();
	}
}
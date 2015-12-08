package com.yyd.myoa.shiro.credentials;

import java.util.concurrent.atomic.AtomicInteger;

import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Ehcache;
import net.sf.ehcache.Element;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
* @ClassName: com.yyd.myoa.shiro.credentials 
* @Description: 用户登录缓存超过规定次数后延长禁止登陆时间 
* @author yuyidi0630@163.com 
* @date 2015年11月23日 上午11:26:21
 */
public class RetryLimitHashedCredentialsMatcher extends
		HashedCredentialsMatcher {
	private Logger log = LoggerFactory.getLogger(RetryLimitHashedCredentialsMatcher.class);
	private Ehcache passwordRetryCache;
	public RetryLimitHashedCredentialsMatcher() {
		CacheManager cacheManager = CacheManager.newInstance(CacheManager.class
				.getClassLoader().getResource("ehcache.xml"));
		passwordRetryCache = cacheManager.getCache("passwordRetryCache");
	}

	@Override
	public boolean doCredentialsMatch(AuthenticationToken token,
			AuthenticationInfo info) {
		String username = (String) token.getPrincipal();
		// retry count + 1
		Element element = passwordRetryCache.get(username);
		if (element == null) {
			element = new Element(username, new AtomicInteger(0));
			passwordRetryCache.put(element);
		}
		AtomicInteger retryCount = (AtomicInteger) element.getObjectValue();
		//输错5次后，限制登陆
		if (retryCount.incrementAndGet() > 5) {
			// if retryCount > 5 throw
			//输错5的倍数次后，延长禁止用户登陆时间
			int delay=0;
			if(retryCount.get()%5==0){
				delay = (int) (60*(Math.pow(retryCount.get()/5, 2)));
				element.setTimeToLive(element.getTimeToLive()+delay);
			}
			log.info("用户:"+username+"登陆错误次数已经"+retryCount.get()+"次,延长禁止登陆时长"+(delay/60)+"分钟");
			throw new ExcessiveAttemptsException("账户已锁定：延长:"+(delay/60)+"分钟,请"
					+ (formatDuring(element.getExpirationTime()
							- System.currentTimeMillis())) + "后重新登陆");
		}
		boolean matches = super.doCredentialsMatch(token, info);
		if (matches) {
			// clear retry count
			log.info("登陆验证通过");
			passwordRetryCache.remove(username);
		}
		return matches;
	}

	public static String formatDuring(long mss) {
		long days = mss / (1000 * 60 * 60 * 24);
		long hours = (mss % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60);
		long minutes = (mss % (1000 * 60 * 60)) / (1000 * 60);
		long seconds = (mss % (1000 * 60)) / 1000;
		String time = days != 0 ? days + "天" + hours + "时" + minutes + "分"
				+ seconds + "秒" : hours != 0 ? hours + "时"+ minutes + "分"
						+ seconds + "秒" 
				: minutes != 0 ? minutes + "分"+seconds + "秒":seconds+"秒";
		return time;
	}
}
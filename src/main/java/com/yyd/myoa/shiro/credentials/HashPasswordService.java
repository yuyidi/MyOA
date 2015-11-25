package com.yyd.myoa.shiro.credentials;

import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.DefaultHashService;
import org.apache.shiro.crypto.hash.Hash;
import org.apache.shiro.crypto.hash.HashRequest;
import org.apache.shiro.util.ByteSource;
/**
 * 
* @ClassName: com.yyd.myoa.shiro.credentials 
* @Description: 自定义hash密码生成 
* @author yuyidi0630@163.com 
* @date 2015年11月23日 上午11:45:36
 */
public class HashPasswordService extends DefaultHashService {
	//随机数作为公盐
    private RandomNumberGenerator rng;
    //算法名称
    private String algorithmName;
    //私盐 内部盐，此内部盐现有程序提供
    private ByteSource privateSalt;
    //算法迭代次数
    private int iterations;
    //是否产生公盐
    private boolean generatePublicSalt;
	
	public HashPasswordService() {
		this.algorithmName = "SHA-512";
        this.iterations = 1;
        this.generatePublicSalt = false;
        this.rng = new SecureRandomNumberGenerator();
	}
	
	@Override
	public Hash computeHash(HashRequest request) {
		return super.computeHash(request);
	}

	public HashPasswordService(String algorithmName, int iterations, boolean generatePublicSalt) {
		super();
		this.algorithmName = algorithmName;
		this.iterations = iterations;
		this.generatePublicSalt = generatePublicSalt;
	}
	
	public RandomNumberGenerator getRng() {
		return rng;
	}

	public void setRng(RandomNumberGenerator rng) {
		this.rng = rng;
	}

	public String getAlgorithmName() {
		return algorithmName;
	}

	public void setAlgorithmName(String algorithmName) {
		this.algorithmName = algorithmName;
	}

	public ByteSource getPrivateSalt() {
		return privateSalt;
	}

	public void setPrivateSalt(ByteSource privateSalt) {
		this.privateSalt = privateSalt;
	}

	public int getIterations() {
		return iterations;
	}

	public void setIterations(int iterations) {
		this.iterations = iterations;
	}

	public boolean isGeneratePublicSalt() {
		return generatePublicSalt;
	}

	public void setGeneratePublicSalt(boolean generatePublicSalt) {
		this.generatePublicSalt = generatePublicSalt;
	}
}

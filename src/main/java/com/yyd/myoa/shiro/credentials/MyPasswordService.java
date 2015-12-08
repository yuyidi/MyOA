package com.yyd.myoa.shiro.credentials;

import org.apache.shiro.authc.credential.HashingPasswordService;
import org.apache.shiro.crypto.hash.DefaultHashService;
import org.apache.shiro.crypto.hash.Hash;
import org.apache.shiro.crypto.hash.HashRequest;
import org.apache.shiro.crypto.hash.HashService;
import org.apache.shiro.util.ByteSource;

/**
 * 
 * @ClassName: com.yyd.myoa.shiro.credentials
 * @Description: 自定义密码编码服务
 * @author yuyidi0630@163.com
 * @date 2015年12月8日 上午11:30:25
 */
public class MyPasswordService implements HashingPasswordService {
	private HashService hashService;
	// 默认加密算法
	private String algorithmName = "SHA-256";
	private int hashIterations = 1;
	private boolean generatePublicSalt = false;

	/**
	 * 生成密文密码
	 */
	@Override
	public String encryptPassword(Object plaintextPassword)
			throws IllegalArgumentException {
		Hash hash = hashPassword(plaintextPassword);
		return hash.toHex();
	}
	
	public String encryptPassword(Object plaintextPassword,String salt) {
		Hash hash = hashPassword(plaintextPassword,salt);
		return hash.toHex();
	}

	@Override
	public boolean passwordsMatch(Object submittedPlaintext, String encrypted) {
		return false;
	}

	@Override
	public Hash hashPassword(Object plaintext) throws IllegalArgumentException {
		ByteSource plaintextBytes = createByteSource(plaintext);
		if (plaintextBytes == null || plaintextBytes.isEmpty()) {
			return null;
		}
		HashRequest request = createHashRequest(plaintextBytes,null);
		return hashService.computeHash(request);
	}
	
	public Hash hashPassword(Object plaintext,String salt) throws IllegalArgumentException {
		ByteSource plaintextBytes = createByteSource(plaintext);
		if (plaintextBytes == null || plaintextBytes.isEmpty()) {
			return null;
		}
		HashRequest request = createHashRequest(plaintextBytes,salt);
		return hashService.computeHash(request);
	}

	@Override
	public boolean passwordsMatch(Object plaintext, Hash savedPasswordHash) {
		return false;
	}

	protected ByteSource createByteSource(Object o) {
		return ByteSource.Util.bytes(o);
	}

	protected HashRequest createHashRequest(ByteSource plaintext,String salt) {
		return new HashRequest.Builder().setSource(plaintext)
				.setAlgorithmName(getAlgorithmName())
				.setIterations(getHashIterations()).setSalt(salt).build();
	}

	public HashService getHashService() {
		return hashService;
	}

	public void setHashService(HashService hashService) {
		this.hashService = hashService;
	}

	public String getAlgorithmName() {
		return algorithmName;
	}

	public void setAlgorithmName(String algorithmName) {
		this.algorithmName = algorithmName;
	}

	public int getHashIterations() {
		return hashIterations;
	}

	public void setHashIterations(int hashIterations) {
		this.hashIterations = hashIterations;
	}

	public boolean isGeneratePublicSalt() {
		return generatePublicSalt;
	}

	public void setGeneratePublicSalt(boolean generatePublicSalt) {
		this.generatePublicSalt = generatePublicSalt;
	}
}

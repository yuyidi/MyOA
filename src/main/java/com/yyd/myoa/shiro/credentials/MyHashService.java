package com.yyd.myoa.shiro.credentials;

import org.apache.shiro.crypto.hash.Hash;
import org.apache.shiro.crypto.hash.HashRequest;
import org.apache.shiro.crypto.hash.HashService;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

public class MyHashService implements HashService {

	@Override
	public Hash computeHash(HashRequest request) {
		if (request == null || request.getSource() == null
				|| request.getSource().isEmpty()) {
			return null;
		}
		String algorithmName = request.getAlgorithmName();
        ByteSource source = request.getSource();
        int iterations = request.getIterations();
        Hash computed = new SimpleHash(algorithmName, source, request.getSalt(), iterations);
		return computed;
	}
}

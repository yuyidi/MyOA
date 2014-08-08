package com.yyd.myoa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yyd.myoa.domain.Sysfun;
import com.yyd.myoa.repository.SysFunRepository;

@Transactional
@Service("sysFunRepositoryService")
public class SysFunRepositoryService {
	@Autowired
	private SysFunRepository sysFunRepository;
	
	public List<Sysfun> sysFunList(){
		List<Sysfun> list = sysFunRepository.findAll();
		return list;
	}
}

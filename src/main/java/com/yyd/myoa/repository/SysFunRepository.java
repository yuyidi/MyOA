package com.yyd.myoa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yyd.myoa.domain.Sysfun;

public interface SysFunRepository extends JpaRepository<Sysfun, java.lang.Integer> {
}

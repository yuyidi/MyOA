package com.yyd.myoa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.yyd.myoa.domain.Userinfo;


public interface UserinfoRepository extends JpaRepository<Userinfo, java.lang.Integer> {
	@Query("select u from Userinfo u where u.userId=:userId")
	public Userinfo getUserinfo(@Param("userId")String userId);
}

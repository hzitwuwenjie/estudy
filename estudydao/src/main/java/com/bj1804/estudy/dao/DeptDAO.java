package com.bj1804.estudy.dao;

import com.bj1804.estudy.entity.Dept;

import org.springframework.stereotype.Repository;

/**
 * DeptDAO继承基类
 */
@Repository
public interface DeptDAO extends MyBatisBaseDao<Dept,Integer> {
}
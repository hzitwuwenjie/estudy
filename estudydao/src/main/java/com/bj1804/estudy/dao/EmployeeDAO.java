package com.bj1804.estudy.dao;

import com.bj1804.estudy.entity.Employee;

import org.springframework.stereotype.Repository;

/**
 * EmployeeDAO继承基类
 */
@Repository
public interface EmployeeDAO extends MyBatisBaseDao<Employee, Integer> {
}
package com.bj1804.estudy.dao;

import com.bj1804.estudy.entity.Business;

import org.springframework.stereotype.Repository;

/**
 * BusinessDAO继承基类
 */
@Repository
public interface BusinessDAO extends MyBatisBaseDao<Business, Integer> {

}
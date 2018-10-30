package com.bj1804.estudy.dao;

import com.bj1804.estudy.entity.Businessauth;

import org.springframework.stereotype.Repository;

/**
 * BusinessauthDAO继承基类
 */
@Repository
public interface BusinessauthDAO extends MyBatisBaseDao<Businessauth, String> {
}
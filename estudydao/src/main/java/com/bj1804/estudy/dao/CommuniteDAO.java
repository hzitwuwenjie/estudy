package com.bj1804.estudy.dao;

import com.bj1804.estudy.entity.Communite;

import org.springframework.stereotype.Repository;

/**
 * CommuniteDAO继承基类
 */
@Repository
public interface CommuniteDAO extends MyBatisBaseDao<Communite, String> {
}
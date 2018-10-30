package com.bj1804.estudy.dao;

import com.bj1804.estudy.entity.Advertisement;

import org.springframework.stereotype.Repository;

/**
 * AdvertisementDAO继承基类
 */
@Repository
public interface AdvertisementDAO extends MyBatisBaseDao<Advertisement, String> {
}
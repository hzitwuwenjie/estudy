package com.bj1804.estudy.dao;

import com.bj1804.estudy.entity.Announcement;

import org.springframework.stereotype.Repository;

/**
 * AnnouncementDAO继承基类
 */
@Repository
public interface AnnouncementDAO extends MyBatisBaseDao<Announcement, String> {
}
package com.bj1804.estudy.dao;

import com.bj1804.estudy.entity.CourseLabel;

import org.springframework.stereotype.Repository;

/**
 * CourseLabelDAO继承基类
 */
@Repository
public interface CourseLabelDAO extends MyBatisBaseDao<CourseLabel, Integer> {
}
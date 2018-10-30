package com.bj1804.estudy.dao;

import com.bj1804.estudy.entity.Course;

import org.springframework.stereotype.Repository;

/**
 * CourseDAO继承基类
 */
@Repository
public interface CourseDAO extends MyBatisBaseDao<Course, String> {
}
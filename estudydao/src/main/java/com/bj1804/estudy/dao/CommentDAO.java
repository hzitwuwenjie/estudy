package com.bj1804.estudy.dao;

import com.bj1804.estudy.entity.Comment;
import org.springframework.stereotype.Repository;

/**
 * CommentDAO继承基类
 */
@Repository
public interface CommentDAO extends MyBatisBaseDao<Comment, String> {
}
package com.spring.project.food.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FoodDAOImpl implements FoodDAO{
	@Autowired
	private SqlSession sqlSession;
}

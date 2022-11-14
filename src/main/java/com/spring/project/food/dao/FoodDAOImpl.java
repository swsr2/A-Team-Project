package com.spring.project.food.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.project.food.dto.FoodDTO;
import com.spring.project.food.dto.ReviewDTO;

@Repository
public class FoodDAOImpl implements FoodDAO{
	@Autowired
	private SqlSession sqlSession;

	@Override
	public FoodDTO selectOne(int fd_no) {
		// TODO Auto-generated method stub
		FoodDTO food = (FoodDTO) sqlSession.selectOne("mapper.food.selectfd_no", fd_no);
		return food;
	}

	@Override
	public int addReview(ReviewDTO review) {
		// TODO Auto-generated method stub
		return sqlSession.insert("mapper.food.addReview", review);
	}

	@Override
	public List<FoodDTO> foodList(Map<String, Integer> page) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("mapper.food.foodList",page);
	}

	@Override
	public void dbInsert(FoodDTO food) {
		// TODO Auto-generated method stub
		sqlSession.insert("mapper.food.dbInsert",food);
	}

	@Override
	public List<FoodDTO> cafeList(Map<String, Integer> page) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("mapper.food.cafeList",page);
	}

	@Override
	public int allFoodCnt() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("mapper.food.allFoodCnt");
	}

	@Override
	public int allCafeCnt() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("mapper.food.allCafeCnt");
	}
}

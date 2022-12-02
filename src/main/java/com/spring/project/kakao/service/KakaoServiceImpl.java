package com.spring.project.kakao.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.project.kakao.dao.KakaoDAO;
import com.spring.project.kakao.vo.KakaoVO;

@Service("kakaoService")
public class KakaoServiceImpl implements KakaoService {
	@Autowired
	private KakaoDAO kakaoDAO;

	@Override
	public KakaoVO findKakao(HashMap<String, Object> userInfo) {
		// TODO Auto-generated method stub
		return kakaoDAO.findKakao(userInfo);
	}

	@Override
	public void kakaoInsert(HashMap<String, Object> userInfo) {
		// TODO Auto-generated method stub
		kakaoDAO.kakaoInsert(userInfo);
	}

}

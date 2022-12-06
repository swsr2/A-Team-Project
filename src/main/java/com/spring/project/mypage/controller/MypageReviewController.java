package com.spring.project.mypage.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


public interface MypageReviewController {
	public ModelAndView mypagereview(@RequestParam("id")String id, HttpServletRequest request, HttpServletResponse response) throws Exception;
	public void reviewDel(int re_no, HttpServletRequest request, 
			HttpServletResponse response) throws IOException;
}

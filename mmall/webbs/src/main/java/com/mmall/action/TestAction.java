package com.mmall.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mmall.own.Tools;

@Controller
@RequestMapping("/test")
public class TestAction {
	//日志
	private static final Logger log=LoggerFactory.getLogger(TestAction.class);
	
	@Resource
	private Tools tools;
	
	@RequestMapping("/test")
	public String test(HttpServletRequest request){
		log.info("进入数据");
		for(int i=0;i<10;i++){
			log.info(">>>> test: val ="+i);
		}
		request.setAttribute("lis", "cc is good "+tools.getTime());
		return "test";
	}
}

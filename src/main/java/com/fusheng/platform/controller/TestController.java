package com.fusheng.platform.controller;

import com.fusheng.platform.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yk
 * @ClassName: TestController
 * @Description: ${todo}
 * @date 2017/8/17 16:22
 */
@RestController
public class TestController{

	@Autowired
	private TestService testService;


	@RequestMapping("/test")
	public String test(Long id,String name){
		this.testService.test(id,name);
		return  "SUCCESS";
	}
}

package com.pl.demo3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	// 使用@RequestMapping来映射请求
	@RequestMapping("/hello")
	public String hello() {
		return "index";
	}
}

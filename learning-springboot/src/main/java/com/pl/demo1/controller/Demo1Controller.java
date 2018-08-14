package com.pl.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: 彭立
 * @date:   2018年8月14日 上午11:16:25
 *   
 */
@Controller
public class Demo1Controller {

	@ResponseBody//这个注解表示直接把return的字符串也就是下面的"helloworld"写回到页面中
	@RequestMapping("/hello")
	public String hello() {
		return "helloworld";
	}
	
}

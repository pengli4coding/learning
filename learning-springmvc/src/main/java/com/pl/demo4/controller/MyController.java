package com.pl.demo4.controller;


import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/my") // @RequestMapping注解用于指示url地址与java类或方法的对应关系
@Controller // @Controller注解用于指示当前类是一个控制器
public class MyController {

	/**
	 * RequestMapping注解用于指示url地址与java类或方法的对应关系
	 * value = "/test1"用于说明当前方法与url地址的对应关系
	 * method = RequestMethod.GET用于指示请求方法必须是get方式的请求，不然报405
	 * params = { "param1=123", "param2" }用于指示请求的时候必须带上名为param1和param2的两个参数，而且param1的参数值为123，不然报404
	 * headers="Host=localhost:8080"用于指示请求报文头里面必须有Host属性，属性值为localhost:8080，不然报404
	 */
	@RequestMapping(value = "/test1", method = RequestMethod.GET, params = { "param1=123", "param2" },headers="Host=localhost:8080")
	public String test1() {
		System.out.println("test1");
		return "index";
	}
	
	/**
	 * 
	 * 在url地址中加上占位符{}，url必须是形如http://localhost:8080/my/test2/123这种形式才能够请求到，{id}对应url地址中的123
	 * PathVariable注解可以用来绑定url地址中占位符的实际的值并传入到请求处理方法的形参中
	 * PathVariable注解中的value值必须与占位符中的值一致
	 * 正是因为springmvc中的这个特性，才使得springmvc支持restfull风格的编程
	 * 
	 */
	@RequestMapping(value="/test2/{id}",method=RequestMethod.DELETE)
	public String test2(@PathVariable("id") Integer myId) {
		System.out.println(myId);
		return "index";	
	}
	
	/**
	 * RequestParam注解用于绑定请求参数
	 * RequestParam中的value属性值必须与前台传进来的参数名称对应上，而请求处理方法的形参名可以不与前台传进来的参数名称对应上
	 * 如果在RequestParam注解中了required=false属性，则表明该参数前台不一定要传入这个参数，没有写则默认是一定要传入的
	 */
	@RequestMapping(value="/test3",method=RequestMethod.GET)
	public String test3(@RequestParam(value="username") String uName,@RequestParam(value="password",required=false) String pwd) {
		System.out.println("用户名: "+uName);
		System.out.println("密码： "+pwd);
		return "index";
	}
	
	/**
	 * RequestHeader注解用于绑定请求报文头的参数值
	 */
	@RequestMapping(value="/test4",method=RequestMethod.GET)
	public String test4(@RequestHeader(value="Accept") String[] values) {
		System.out.println("请求报文头中的内容如下： ");
		for(String item:values) {
			System.out.println(item);
		}
		return "index";
	}
	
	/**
	 * springmvc框架会帮我们将前台传参绑定到我们的POJO上，并作为实参传入到请求处理方法中
	 * 
	 * 表单的设计看项目下的form.jsp文件（注意看name属性）：
	 */
	@RequestMapping(value="/test5",method=RequestMethod.POST)
	public String test5(User user) {
		System.out.println(user);
		return "index";
	}
	
	/**
	 * 
	 * springmvc框架使用servlet原生api的用法
	 * 
	 */
	@RequestMapping(value="/test6",method=RequestMethod.GET)
	public void test6(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		String uname = req.getParameter("username");
		resp.getWriter().write(uname);
	}

}

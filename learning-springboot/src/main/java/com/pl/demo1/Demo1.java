package com.pl.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description:springboot的主入口程序
 * @author: 彭立
 * @date: 2018年8月14日 上午11:09:55
 * 
 */
//用@SpringBootApplication注解来标注一个主程序类，说明这是一个springboot的应用
@SpringBootApplication
public class Demo1 {
	public static void main(String[] args) {
		SpringApplication.run(Demo1.class, args);
	}
}

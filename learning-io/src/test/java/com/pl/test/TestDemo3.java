package com.pl.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pl.demo3.Demo3;

/**
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 彭立
 * @date:   2018年9月2日 下午8:48:37
 *   
 */
public class TestDemo3 {

	@Test
	public void test() {
		Demo3.output("src/main/java/com/pl/demo3/demo3.txt");
	}
	
	@Test
	public void test1() {
		Demo3.output1("src/main/java/com/pl/demo3/demo3.txt");
	}
	
	@Test
	public void test2() {
		Demo3.outputFlush("src/main/java/com/pl/demo3/demo3.txt");
	}
	
	@Test
	public void test3() {
		Demo3.input("src/main/java/com/pl/demo3/demo3.txt");
	}
	
	@Test
	public void test4() {
		Demo3.input1("src/main/java/com/pl/demo3/demo3.txt");
	}
	
	@Test
	public void test5() {
		Demo3.inputAndOutput("src/main/java/com/pl/demo3/source.txt","src/main/java/com/pl/demo3/destination.txt");
	}

}

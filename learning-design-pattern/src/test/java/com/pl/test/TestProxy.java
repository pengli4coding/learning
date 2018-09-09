/**
 * 
 */
package com.pl.test;

import org.junit.Test;

import com.pl.proxy.jdk.MichaelJackson;
import com.pl.proxy.jdk.MyInvocationHandler;
import com.pl.proxy.jdk.Singer;


/**
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 彭立
 * @date:   2018年9月2日 下午5:23:27
 *   
 */
public class TestProxy {

	@Test
	public void testJDKProxy() {
		MichaelJackson michael=new MichaelJackson();
		Singer singer = (Singer)new MyInvocationHandler().createProxyInstance(michael);
		System.out.println(singer.getClass());
		singer.sing();
	}

}

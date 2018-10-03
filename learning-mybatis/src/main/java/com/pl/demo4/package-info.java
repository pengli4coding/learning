/**
 * @Description:demo4主要学习基于接口方式的增删改查操作
 * @author: 彭立
 * @date:   2018年10月3日 下午5:13:24
 *   
 */
package com.pl.demo4;

/**
 * 
 * 
 * 在实际的工作中，我们用的最多的是基于接口方式的CRUD操作
 * 
 * 在具体介绍基于接口方式的CRUD操作之前，我们先看一下之前的CRUD操作有什么弊端
 * 如下面：
 * 	sqlSession.selectOne("com.pl.demo3.UnitMapper.selectUnitById", 51);
 * 我们在传入第二个参数的时候，根据selectOne()方法的定义，是传入一个Object类型的参数，所以我们甚至可以传一个"abc"字符串进去而不会报错，这不是我们想要的
 * 
 * 
 * 
 * 
 */
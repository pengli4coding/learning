/**
 * @Description:demo6主要学习IoC中注解@Autowired的使用，即俗称的“自动扫包”
 * @author: 彭立
 * @date: 2018年9月1日 下午6:04:20
 * 
 */
package com.pl.demo6;

/**
 *
 *
 * “@Autowired”注解个人觉得在实际开发工作中是用的非常多的注解
 * 个人觉得开发人员偏爱“@Autowired”注解
 * 
 * 
 * 
 * 
 * “@Autowired”注解可以加在成员变量上也可以加在set方法上
 * 第一种：加在成员变量上
 * “@Autowired”匹配bean的流程如下所示：
 * 
 * “@Autowired”加在成员变量上
 *              |
 *              |
 *             \|/
 * 在spring容器中找看有没有唯一的类型能够匹配的上的bean
 * 
 * 
 * 如果需要注入指定id号的bean，则“@Autowired”注解需要配合“@Qualifier”来使用
 *              
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 第二种：加在set方法上
 * 由于个人觉得加在set方法上的匹配规则过多，代码阅读起来不够直观，相对麻烦，在实际开发工作中几乎不会用到，所有这里不会做详细的讲解，如果真的有用到的话再去学一下吧
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
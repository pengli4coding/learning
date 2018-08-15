/**
 * 
 */
/**
 * @Description:demo4主要学习bean的延迟加载（lazy-init）、作用域（scope）、生命周期（init-method、destroy-method）
 * @author: 彭立
 * @date: 2018年8月15日 上午10:31:49
 * 
 */
package com.pl.demo4;

/**
 * 什么是bean的延迟加载和非延迟加载？
 * 其实bean默认是非延迟加载的（也就意味着bean是在spring容器初始化的时候被创建的）
 * 而在配置bean的时候可以配置一个lazy-init="true"属性，这时候bean就是延迟加载的，延迟加载说白了就是要用到bean的时候才会被实例化（如getBean的时候）
 * 如果不配置lazy-init属性，则bean默认就是非延迟加载，也就相对于lazy-init="false"
 * 
 * 
 * 什么是bean的作用域?
 * 其实我用语言也很难描述（也许是我自己理解的不够透彻吧。。。）
 * 目前我只是知道bean的作用域是通过scope属性来配置的
 * scope="singleton"的时候bean是单例的，如果bean是单例的话，则bean可以是延迟加载的，也可以是非延迟加载的
 * scope="prototype"的时候bean是多例的，如果bean是多例的话，则bean必须是延迟加载的
 * 
 * 
 * 
 * 什么是bean的生命周期？
 * 理解bean的生命周期其实主要是弄懂bean是什么时候创建、bean是什么时候销毁的
 * 这里只说明单例bean的生命周期（因为如果是非单例bean，如多例bean它的生命周期不完全是由spring容器来管理的）
 * 单例bean随着spring容器的初始化而被创建，随着spring容器的关闭而销毁
 * 
 */

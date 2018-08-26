package com.pl.demo3;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * @author: 彭立
 * @date: 2018年8月26日 上午9:33:56
 * 
 */
public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			//创建hibernate配置对象
			Configuration cfg=new Configuration();
			//创建hibernate.cfg.xml的位置
			cfg.configure("com/pl/demo3/hibernate.cfg.xml");
			//注册配置属性信息
			ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
			//返回SessionFactory对象
			return cfg.buildSessionFactory(sr);
		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}

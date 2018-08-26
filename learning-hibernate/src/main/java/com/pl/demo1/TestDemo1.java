/**
 * 
 */
package com.pl.demo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

/**
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 彭立
 * @date: 2018年8月26日 上午9:47:21
 * 
 */
public class TestDemo1 {

	@Test
	public void test() {
		//设置user的属性
		Date birthday = null;
		try {
			birthday = new SimpleDateFormat("yyyy-MM-dd").parse("1990-09-02");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		User user = new User();
		user.setUserId(1);
		user.setUname("用户A");
		user.setGender(1);
		user.setBirthday(birthday);

		// 通过HibernateUtil获取Session
		Session session = HibernateUtil.getSessionFactory().openSession();
		// 开事务
		Transaction tx = session.beginTransaction();
		try {
			session.save(user);// 保存user
			tx.commit();// 提交事务
		} catch (Exception e) {
			tx.rollback();// 发生错误回滚事务
			e.printStackTrace();
		} finally {
			session.close();//关闭session
		}
	}

}

package com.pl.demo2;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;

/**
 * @author: 彭立
 * @date:   2018年8月25日 下午5:29:29
 *   
 */
public class TestDemo2 {

	@Test
	public void test() {
		//加载hibernate.cfg.xml配置文件
		Configuration cfg=new Configuration();
		cfg.configure("com/pl/demo2/hibernate.cfg.xml");
		//往数据库中生成schema
		SchemaExport se=new SchemaExport(cfg);
		se.create(true, true);
	}

}

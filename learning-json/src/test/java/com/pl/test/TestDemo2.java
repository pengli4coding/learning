package com.pl.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.pl.demo2.MyBean;
import com.pl.demo2.Officer;
import com.pl.demo2.Wife;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class TestDemo2 {

	@Test
	public void test() {
		String[] stringArray = new String[] { "刘备", "关羽", "张飞" };
		Object[] objectArray = new Object[] { "刘备", false, 45 };
		JSONArray jsonArray1 = com.pl.demo2.Demo2.javaArrayToJsonArray(stringArray);
		JSONArray jsonArray2 = com.pl.demo2.Demo2.javaArrayToJsonArray(objectArray);
		System.out.println(jsonArray1);
		System.out.println(jsonArray2);
	}

	@Test
	public void test1() {
		List<String> list = new ArrayList<>();
		list.add("刘备");
		list.add("关羽");
		list.add("张飞");
		JSONArray jsonArray = com.pl.demo2.Demo2.javaListToJsonArray(list);
		System.out.println(jsonArray);
	}

	@Test
	public void test2() {
		// JSONArray JSONArray = com.pl.demo2.Demo2.javaStringToJsonArray("aa");//错误的格式
		JSONArray jsonArray = com.pl.demo2.Demo2.javaStringToJsonArray("['刘备',true,1]");// 正确的格式
		System.out.println(jsonArray);
	}

	@Test
	public void test3() {
		MyBean mybean = new MyBean();
		mybean.setName("刘备");
		mybean.setAge(45);
		mybean.setFlag(false);

		Wife wife = new Wife();
		wife.setWifeName("刘夫人");
		wife.setAge(30);

		mybean.setWife(wife);

		// 注意mybean中没有设置brother，主要想看一下null在json是怎样表现的

		Officer officer1 = new Officer();
		officer1.setName("关羽");
		officer1.setAge("37");

		Officer officer2 = new Officer();
		officer2.setName("张飞");
		officer2.setAge("35");

		List<Officer> officers = new ArrayList<>();
		officers.add(officer1);
		officers.add(officer2);
		mybean.setOfficerList(officers);

		JSONObject jsonObject = com.pl.demo2.Demo2.javaBeanToJSONObject(mybean);
		System.out.println(jsonObject);
	}

	@Test
	public void test4() {
		Map<String, Object> map = new HashMap<>();
		map.put("name", "json");
		map.put("bool", Boolean.TRUE);
		map.put("int", new Integer(1));
		map.put("arr", new String[] { "a", "b" });
		JSONObject jsonObject = com.pl.demo2.Demo2.javaMapToJSONObject(map);
		System.out.println(jsonObject);
	}

	@Test
	public void test5() {
		String str="{\"age\":45,\"brother\":null,\"flag\":false,\"name\":\"刘备\",\"officerList\":[{\"age\":\"37\",\"name\":\"关羽\"},{\"age\":\"35\",\"name\":\"张飞\"}],\"wife\":{\"age\":30,\"wifeName\":\"刘夫人\"}}";
		MyBean myBean = com.pl.demo2.Demo2.JSONStringToJavaBean(str);
		System.out.println(myBean);
	}

}

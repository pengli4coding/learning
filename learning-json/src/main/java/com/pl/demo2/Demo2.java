package com.pl.demo2;

import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Demo2 {

	// java数组转为json数组
	public static JSONArray javaArrayToJsonArray(Object[] array) {
		return JSONArray.fromObject(array);
	}

	// java列表转为json数组
	public static JSONArray javaListToJsonArray(List list) {
		return JSONArray.fromObject(list);
	}

	// 字符串转为json数组
	// 注意：这里传入的字符串的格式类似是："['json','is','easy']"
	// 如果传入的格式不符合要求则会抛出运行时异常
	public static JSONArray javaStringToJsonArray(String str) {
		return JSONArray.fromObject(str);
	}

	// java bean转为json对象
	public static JSONObject javaBeanToJSONObject(MyBean mybean) {
		return JSONObject.fromObject(mybean);
	}

	// java map转为json对象
	public static JSONObject javaMapToJSONObject(Map map) {
		return JSONObject.fromObject(map);
	}

	// json字符串转为java bean
	// 注意：这里传入的字符串的格式类似是："['json','is','easy']"
	// 如果传入的格式不符合要求则会抛出运行时异常
	public static MyBean JSONStringToJavaBean(String str) {
		JSONObject jsonObject = JSONObject.fromObject(str);//先从字符串转为json对象
		MyBean myBean = (MyBean) JSONObject.toBean(jsonObject, MyBean.class);//再从json对象转为java bean
		return myBean;
	}

}

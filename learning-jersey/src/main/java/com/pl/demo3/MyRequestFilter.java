package com.pl.demo3;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.apache.commons.io.IOUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class MyRequestFilter implements ContainerRequestFilter {

	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		MultivaluedMap<String, String> headers = requestContext.getHeaders();
		System.out.println(headers);
		System.out.println("==============================");
		UriInfo uriInfo = requestContext.getUriInfo();
		System.out.println(uriInfo.getAbsolutePath() + "    " + uriInfo.getPath());
		System.out.println("==============================");
		InputStream in = requestContext.getEntityStream();
		String str = IOUtils.toString(in);
		/*JSONObject jsonObject = JSON.parseObject(str);
		Map<String, Object> map = jsonObject.getInnerMap();
		for(Map.Entry<String, Object> entry:map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println("========================");
		}*/
		str=str+"这是一个结尾";
		InputStream targetStream = IOUtils.toInputStream(str, StandardCharsets.UTF_8.name());
		//对输入流进行增强
		requestContext.setEntityStream(targetStream);
		if(true) {
			//requestContext.abortWith(Response.status(Response.Status.BAD_REQUEST)).entity("Client-Name header must be defined.").build();
		}
		
		
	}

}

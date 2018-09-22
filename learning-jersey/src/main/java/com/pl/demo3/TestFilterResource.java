package com.pl.demo3;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("testFilter") // 配置REST资源路径
public class TestFilterResource {

	@POST // 请求方法为POST方法
	@Consumes({ MediaType.APPLICATION_JSON }) // 请求内容的MIME类型为"application/json"
	@Produces({ MediaType.APPLICATION_JSON }) // 返回内容的MIME类型为"application/json"
	public String test(String str) {
		System.out.println(str);
		return "200";
	}
}

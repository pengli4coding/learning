package com.pl.demo1;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("helloworld") // 配置REST资源路径
public class HelloWorldResource {

	@GET // 请求方法为get方法
	@Path("textresponse")
	@Produces({ MediaType.TEXT_PLAIN }) // 返回内容的MIME类型为"text/plain"
	public String getHello() {
		return "hello jersey";
	}

	@POST // 请求方法为pose方法
	@Path("jsonresponse")
	@Consumes({ MediaType.APPLICATION_JSON }) // 请求内容的MIME类型为"application/json"
	@Produces({ MediaType.APPLICATION_JSON }) // 返回内容的MIME类型为"application/json"
	public String postHello(String jsonStr) {
		return "{\"name\":\"lili\"}";
	}

}

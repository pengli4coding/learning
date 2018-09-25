package com.pl.demo5;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
/**
 * 
 * @Description:
 * @author 彭立
 * @date: 2018-09-25 10:09:08
 *
 */
public class BusinessExceptionMapper implements ExceptionMapper<BusinessException> {

	@Override
	public Response toResponse(BusinessException exception) {
		// TODO Auto-generated method stub
		return null;
	}

}

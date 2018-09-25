package com.pl.demo5;

/**
 * 
 * @Description:业务异常
 * @author 彭立
 * @date: 2018-09-25 09:58:53
 *
 */
public abstract class BusinessException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private ExceptionCode code = ExceptionCode.DEFAULT_ERROR;

	public BusinessException(String msg) {
		super(msg);
	}

	public BusinessException(String msg, ExceptionCode code) {
		super(msg);
		this.code = code;
	}

	public BusinessException(String msg, ExceptionCode code, Throwable ex) {
		super(msg, ex);
		this.code = code;
	}

}

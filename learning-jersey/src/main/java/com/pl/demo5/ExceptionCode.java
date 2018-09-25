package com.pl.demo5;

public enum ExceptionCode {
	
	DEFAULT_ERROR(0), // 定义的一些错误码
	PERMISSION_EXCEPTION(1), // 定义的一些错误码
	MONEY_CHECK_EXCEPTION(2), // 定义的一些错误码
	ACCOUNT_STATUS_ERROR(3);// 定义的一些错误码

	
	private ExceptionCode(int code) {
		this.code = code;
	}

	private int code;

}

package com.example.demo.constants;

public enum RtnCode {

	SUCCESSFUL(200, "OK!"), //
	PARAM_ERROR(400, "Param error!"), //
	ACCOUNT_EXISTED(400, "Account existed!"), //
	ACCOUNT_NOT_FOUND(404,"Account not found!"), //
	AMOUNT_ERROR(400, "Amount error!"), //
	BALANCE_NOT_ENOUGH(400, "Blance not enough"), //
	;
	
	private int code;
	
	private String message;

	
	
	private RtnCode(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	
	
}

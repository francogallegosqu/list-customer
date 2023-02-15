package com.tech.customer.exception;

public class ServerException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private String code = "SERVER-001";
	public ServerException(String message) {
		super(message);
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}

package com.jenwis.common.account.bean;

import java.io.Serializable;

public class Account implements Serializable {
	private String account;
	private int statusCode;
	
	/*
	 * 这里需要一个空构造，由Spring转换对象时，进行初始化
	 * */
	public Account() {
		
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

}

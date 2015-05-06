package com.jenwis.common.account.bean;

import java.io.Serializable;

public class Account implements Serializable {
	//账号
	private String account;
	
	//密码
	private String password;
	
	//授权码
	private String authCode;
	
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAuthCode() {
		return authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

}

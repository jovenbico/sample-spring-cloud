package com.champ.sample.user.service.controller;

import java.io.Serializable;

public class UserInfoResource implements Serializable {

	private static final long serialVersionUID = -897234607026462616L;

	private String name;
	private AccountInfo account;

	public UserInfoResource() {
		this(null, null);
	}

	public UserInfoResource(String name, AccountInfo account) {
		this.name = name;
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AccountInfo getAccount() {
		return account;
	}

	public void setAccount(AccountInfo account) {
		this.account = account;
	}

}

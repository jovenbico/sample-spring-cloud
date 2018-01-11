package com.champ.sample.user.service.controller;

import java.io.Serializable;

public class AccountInfo implements Serializable {
	private static final long serialVersionUID = -4987360039916878576L;

	public AccountInfo() {
	}

	private String account;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

}

package com.champ.sample.acount.service.controller;

import java.io.Serializable;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/accounts", produces = { MediaType.APPLICATION_JSON_VALUE })
public class AccountController {

	@GetMapping(value = "/info")
	public ResponseEntity<AccountInfoResource> accountInfo() {

		AccountInfoResource resource = new AccountInfoResource("account-info");

		return ResponseEntity.ok(resource);
	}

	public class AccountInfoResource implements Serializable {
		private static final long serialVersionUID = -4671073471849753232L;

		private String account;

		public AccountInfoResource() {
		}

		public AccountInfoResource(String account) {
			this.account = account;
		}

		public String getAccount() {
			return account;
		}

		public void setAccount(String account) {
			this.account = account;
		}

	}

}

package com.champ.sample.user.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/users", consumes = { MediaType.APPLICATION_JSON_VALUE })
public class UserController {

	private final String ACCOUNT_SERVICE_URL = "http://ACCOUNTS-SERVICE";

	@Autowired
	RestTemplate restTemplate;

	@GetMapping(value = "/info")
	public ResponseEntity<UserInfoResource> userInfo() {

		AccountInfo accountInfo = restTemplate.getForObject( //
				ACCOUNT_SERVICE_URL + "/accounts/info", AccountInfo.class //
		);

		UserInfoResource resource = new UserInfoResource("Joven", accountInfo);
		return ResponseEntity.ok(resource);

	}

}

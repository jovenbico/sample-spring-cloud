package com.champ.sample.acount.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@EnableDiscoveryClient
@ComponentScan(basePackages = { "com.champ.sample.acount.service.controller" })
public class AccountServer {

	public static void main(String[] args) {
		// Will configure using accounts-server.yml
		System.setProperty("spring.config.name", "accounts-server");

		SpringApplication.run(AccountServer.class, args);
	}

}

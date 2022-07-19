package com.ctsproject.userservice;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = { "com.ctsproject" })

public class UrlshorteningserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UrlshorteningserviceApplication.class, args);
	}
}

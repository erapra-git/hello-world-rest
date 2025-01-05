package com.demo.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloWorldRestApplication {

	@RequestMapping("/")
	public String hello() {
		return "Hello World "+System.currentTimeMillis();
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldRestApplication.class, args);
	}

}
package com.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubAppApplication.class, args);
	}

	@GetMapping("/demo")
	public String getMethodName() {
		return "hello world";
	}
	
}

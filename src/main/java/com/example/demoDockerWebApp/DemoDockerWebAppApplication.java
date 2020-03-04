package com.example.demoDockerWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoDockerWebAppApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello Docker World Second";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoDockerWebAppApplication.class, args);
	}

}

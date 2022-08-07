package com.iqss.helloconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class HelloconfigApplication {

	@Value("${config.name}")
	String name = "World";

	@GetMapping("/")
	public String home() {
		return "Hello " + name;
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloconfigApplication.class, args);
	}

}

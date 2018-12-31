package com.ajay.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.ajay")
public class JpaProject1Application {
	
	public static void main(String[] args) {
		SpringApplication.run(JpaProject1Application.class, args);
	}
}

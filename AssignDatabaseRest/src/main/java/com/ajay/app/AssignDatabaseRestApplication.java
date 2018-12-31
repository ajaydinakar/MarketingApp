package com.ajay.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan(basePackages="com.ajay")
@EntityScan("com.ajay.domain")
@EnableJpaRepositories("com.ajay.dao")
@EnableMongoRepositories("com.ajay.dao")
public class AssignDatabaseRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignDatabaseRestApplication.class, args);
	}
}

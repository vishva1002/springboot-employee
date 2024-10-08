package com.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication(scanBasePackages = "com.management")
@EnableJpaRepositories(basePackages = "com.management.Repository")

public class EmployementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployementApplication.class, args);
	}

}

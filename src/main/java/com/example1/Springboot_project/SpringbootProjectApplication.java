package com.example1.Springboot_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication (scanBasePackages = "com.example1.Springboot_project.Controller")
@EntityScan(basePackages = "com.example1.Springboot_project.DBdetails")
@EnableJpaRepositories(basePackages ="com.example1.Springboot_project.Repo" )
public class SpringbootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProjectApplication.class, args);
	}

}

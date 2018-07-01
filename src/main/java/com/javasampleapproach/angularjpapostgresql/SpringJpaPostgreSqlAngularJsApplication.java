package com.javasampleapproach.angularjpapostgresql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringJpaPostgreSqlAngularJsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaPostgreSqlAngularJsApplication.class, args);
	}
}

package com.eurekaserverclient.example.springeurekastudentclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringEurekaStudentClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaStudentClientApplication.class, args);
	}

}

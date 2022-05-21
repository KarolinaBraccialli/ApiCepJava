package com.padroesprojeto.ApiCepJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ApiCepJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiCepJavaApplication.class, args);
	}

}

package com.ReturnService.Return;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ReturnApplication {
	public static void main(String[] args) {
		SpringApplication.run(ReturnApplication.class, args);
	}

}

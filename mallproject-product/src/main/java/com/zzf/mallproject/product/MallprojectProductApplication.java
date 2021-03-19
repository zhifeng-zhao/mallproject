package com.zzf.mallproject.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MallprojectProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallprojectProductApplication.class, args);
	}

}

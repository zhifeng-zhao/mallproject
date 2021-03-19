package com.zzf.mallproject.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MallprojectOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallprojectOrderApplication.class, args);
	}

}

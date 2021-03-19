package com.zzf.mallproject.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MallprojectWareApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallprojectWareApplication.class, args);
	}

}

package com.zzf.mallproject.menber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MallprojectMenberApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallprojectMenberApplication.class, args);
	}

}

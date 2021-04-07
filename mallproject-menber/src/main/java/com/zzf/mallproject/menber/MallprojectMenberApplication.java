package com.zzf.mallproject.menber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.zzf.mallproject.menber.feign")
public class MallprojectMenberApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallprojectMenberApplication.class, args);
	}

}

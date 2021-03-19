package com.zzf.mallproject.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MallprojectCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallprojectCouponApplication.class, args);
	}

}

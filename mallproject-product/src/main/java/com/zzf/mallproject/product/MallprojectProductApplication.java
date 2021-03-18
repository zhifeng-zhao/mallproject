package com.zzf.mallproject.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zzf.mallproject.product.dao")
@SpringBootApplication
public class MallprojectProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallprojectProductApplication.class, args);
	}

}

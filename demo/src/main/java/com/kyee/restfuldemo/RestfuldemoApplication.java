package com.kyee.restfuldemo;

import org.mybatis.spring.annotation.MapperScan;
		import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.kyee.restfuldemo.Dao")
public class RestfuldemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfuldemoApplication.class, args);
	}


}

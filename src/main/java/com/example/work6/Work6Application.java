package com.example.work6;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.work6.mapper")
public class Work6Application {

	public static void main(String[] args) {
		SpringApplication.run(Work6Application.class, args);
	}

}

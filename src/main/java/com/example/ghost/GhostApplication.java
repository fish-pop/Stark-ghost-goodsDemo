package com.example.ghost;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.ghost.dao")
public class GhostApplication {

	public static void main(String[] args) {
		SpringApplication.run(GhostApplication.class, args);
	}

}

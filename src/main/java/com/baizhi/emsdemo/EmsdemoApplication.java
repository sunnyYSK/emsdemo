package com.baizhi.emsdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.baizhi.emsdemo.dao")
public class EmsdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmsdemoApplication.class, args);
                System.out.println();
	}

}

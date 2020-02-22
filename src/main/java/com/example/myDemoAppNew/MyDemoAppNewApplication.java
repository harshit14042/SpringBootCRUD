package com.example.myDemoAppNew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.myDemoAppNew.rest")
public class MyDemoAppNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyDemoAppNewApplication.class, args);
	}

}

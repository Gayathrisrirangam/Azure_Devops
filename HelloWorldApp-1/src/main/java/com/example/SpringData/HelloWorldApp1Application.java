package com.example.SpringData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApp1Application.class, args);
		System.out.println("Hello world");
	}

}

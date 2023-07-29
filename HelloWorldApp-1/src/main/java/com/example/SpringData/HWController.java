package com.example.SpringData;

import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping("/hello")

	public class HWController {

		  @GetMapping
		    public String sayHello() {
		        return "Hello, Gayathri!";
		    }
		}

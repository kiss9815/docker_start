package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
	@GetMapping
	String hellworld(){
		System.out.println("index");
		return "hello";
	}
	
	@GetMapping("/hello")
	String hell2world(){
		System.out.println("hello");
		return "hello222222222";
	}
}

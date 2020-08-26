package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class RestControllerNew {
		
		@GetMapping("/hello")
		public String helloWorld() {
			return "hello from azure rest new";
		}

}

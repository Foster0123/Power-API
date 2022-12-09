package com.gauss.cannon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CannonApplication {

	public static void main(String[] args) {
		SpringApplication.run(CannonApplication.class, args);
	}
	@GetMapping("/")
	public String index() {
		return "Hello From Spring-Boot-App-Java Index Page";
	}
	@GetMapping("/about")
	public String about(@RequestParam(value= "name", defaultValue = "foss") String name){
		return String.format("Showing About Page %s", name);
	}
}

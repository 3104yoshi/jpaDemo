package com.example.jpaDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpaDemo.db.repository.JpaAccessor;

@SpringBootApplication
@RestController
public class JpaDemoApplication {

	// private JpaAccessor jpaAccessor;

	// public JpaDemoApplication(JpaAccessor jpaAccessor) {
	// 	this.jpaAccessor = jpaAccessor;
	// }

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	// @GetMapping("/get_item")
	// public void getItem() {
	// 	jpaAccessor.findAll();
	// }

}

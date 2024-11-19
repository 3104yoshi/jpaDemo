package com.example.jpaDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaDemoApplication {

	// private JpaAccessor jpaAccessor;

	// public JpaDemoApplication(JpaAccessor jpaAccessor) {
	// 	this.jpaAccessor = jpaAccessor;
	// }

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	// @Bean
	// public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
	// 	return args -> {

	// 		System.out.println("Let's inspect the beans provided by Spring Boot:");

	// 		String[] beanNames = ctx.getBeanDefinitionNames();
	// 		Arrays.sort(beanNames);
	// 		for (String beanName : beanNames) {
	// 			System.out.println(beanName);
	// 		}

	// 	};
	// }

	// @GetMapping("/hello")
	// public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
	// 	return String.format("Hello %s!", name);
	// }

	// @GetMapping("/get_item")
	// public void getItem() {
	// 	jpaAccessor.findAll();
	// }

}

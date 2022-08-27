package com.produtos.apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ApiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestApplication.class, args);
	}
	
	@GetMapping
	public String index() {
		return "Olá, esse é o link para utilizar a API: https://api-rest-spring-produtos-lca.herokuapp.com/swagger-ui.html";
	}

}

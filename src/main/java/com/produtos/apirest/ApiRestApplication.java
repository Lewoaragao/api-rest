package com.produtos.apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestApplication.class, args);
	}
	
	@GetMapping("/")
	public String index() {
		return "Olá clique aqui para usar a API: <a href='https://api-rest-spring-produtos-lca.herokuapp.com/swagger-ui.html'>link</a>.";
	}

}

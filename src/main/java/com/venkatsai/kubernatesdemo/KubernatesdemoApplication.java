package com.venkatsai.kubernatesdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KubernatesdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KubernatesdemoApplication.class, args);
	}

	@RequestMapping("/hello")
	public String wish(){
		return "Hello World !";
	}

}

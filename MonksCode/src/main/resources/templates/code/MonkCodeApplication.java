package com.codingmonk.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan({"com.codingmonk.controller","com.codingmonk.dto","com.codingmonk.services"})
@SpringBootApplication
public class MonkCodeApplication {

	@RequestMapping("/")
	public String entry() {
		return "Monk User";
	}
	public static void main(String[] args) {
		SpringApplication.run(MonkCodeApplication.class, args);
	}

}

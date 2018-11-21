package com.bank.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BanksApplication {
	
	
		public static void main(String[] args) {
			SpringApplication.run(BanksApplication.class, args);
	}

}

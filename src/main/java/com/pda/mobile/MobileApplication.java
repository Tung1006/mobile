package com.pda.mobile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableJpaRepositories
@EnableAutoConfiguration
@EnableScheduling
public class MobileApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileApplication.class, args);
	}

}

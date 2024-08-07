package com.prateekb.footbalApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class FootbalAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(FootbalAppApplication.class, args);
	}

}

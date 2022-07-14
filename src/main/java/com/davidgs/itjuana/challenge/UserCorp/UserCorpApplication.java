package com.davidgs.itjuana.challenge.UserCorp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class UserCorpApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserCorpApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://192.168.0.124:4200","http://143.198.109.24","https://143.198.109.24/").allowedMethods("*").allowedHeaders("*").maxAge(3600L);
			}
		};
	}

}

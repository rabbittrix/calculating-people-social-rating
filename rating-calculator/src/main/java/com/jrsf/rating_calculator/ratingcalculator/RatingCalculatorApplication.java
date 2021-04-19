package com.jrsf.rating_calculator.ratingcalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@EnableRedisRepositories
@SpringBootApplication
public class RatingCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingCalculatorApplication.class, args);
	}

}

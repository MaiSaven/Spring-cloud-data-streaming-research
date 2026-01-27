package com.kafka.research.consumer;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SaleTransform {
	@Bean
	public Function<String, String> saleProcessor() {
		return message -> {
			System.out.println("Processor Received: " + message);
			return "{\"message\":\"bye bye\"}";
		};
	}

}

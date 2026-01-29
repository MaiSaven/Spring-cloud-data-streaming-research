package com.kafka.research.producer;

import java.util.function.Supplier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SaleSource {
	@Bean
	public Supplier<String> saleProducer() {
	    return () -> "{\"message\":\"hello\"}";
	}

}

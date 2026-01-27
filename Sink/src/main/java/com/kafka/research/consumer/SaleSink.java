package com.kafka.research.consumer;

import java.util.function.Consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SaleSink {
	@Bean
	public Consumer<String> saleConsumer() {
		return message -> {
			System.out.println("Consumer Received: " + message);
		};
	}

}

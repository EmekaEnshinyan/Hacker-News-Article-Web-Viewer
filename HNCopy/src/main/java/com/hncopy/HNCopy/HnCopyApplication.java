package com.hncopy.HNCopy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class HnCopyApplication {

	private static final Logger log = LoggerFactory.getLogger(HnCopyApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(HnCopyApplication.class, args);

	}
	@Bean
	public RestTemplate restTemplate(RestTemplate builder){
		return builder;
	}
}


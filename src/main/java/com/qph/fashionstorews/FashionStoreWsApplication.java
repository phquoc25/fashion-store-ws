package com.qph.fashionstorews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class FashionStoreWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FashionStoreWsApplication.class, args);
	}

}

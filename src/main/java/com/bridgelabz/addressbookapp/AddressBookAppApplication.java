package com.bridgelabz.addressbookapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class AddressBookAppApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(AddressBookAppApplication.class, args);
		log.info("Address Book App started in {} Environment",
				 context.getEnvironment().getProperty("environment"));
		log.info("Address Book DB User is {}",
				  context.getEnvironment().getProperty("spring.datasource.username"));
	}
}

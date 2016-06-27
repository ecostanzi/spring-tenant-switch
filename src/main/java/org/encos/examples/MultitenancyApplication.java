package org.encos.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class MultitenancyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultitenancyApplication.class, args);
	}
}

package com.pamp.pampero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication @ComponentScan(basePackages = {"com.pamp.pampero.controller"})
public class PamperoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PamperoApplication.class, args);
		//modifico esta clase con comentario solo para crear la rama
	}

}

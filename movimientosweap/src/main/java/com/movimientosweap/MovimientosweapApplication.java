package com.movimientosweap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({ "com.movimientosweap.common.entity", "com.movimientosweap.entity" })
public class MovimientosweapApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovimientosweapApplication.class, args);
	}

}

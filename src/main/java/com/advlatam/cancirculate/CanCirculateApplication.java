package com.advlatam.cancirculate;

import com.advlatam.cancirculate.enums.TypeVehicle;
import com.advlatam.cancirculate.models.Owner;
import com.advlatam.cancirculate.models.Vehicle;
import com.advlatam.cancirculate.repositories.OwnerRepository;
import com.advlatam.cancirculate.repositories.VehicleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CanCirculateApplication {

	public static void main(String[] args) {
		SpringApplication.run(CanCirculateApplication.class, args);
	}
}

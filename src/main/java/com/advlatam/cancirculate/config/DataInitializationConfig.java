package com.advlatam.cancirculate.config;

import com.advlatam.cancirculate.enums.TypeVehicle;
import com.advlatam.cancirculate.models.Owner;
import com.advlatam.cancirculate.models.Vehicle;
import com.advlatam.cancirculate.repositories.OwnerRepository;
import com.advlatam.cancirculate.repositories.VehicleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializationConfig {
    @Bean
    CommandLineRunner commandLineRunner(OwnerRepository ownerRepository, VehicleRepository vehicleRepository) {
        return args -> {
            Owner owner = new Owner();
            owner.setId("1315815389");
            owner.setName("Asdrubal");
            owner.setLastName("Zambrano");
            owner.setAge(25);
            ownerRepository.save(owner);

            Vehicle vehicle = new Vehicle();
            vehicle.setPlate("PAA1234");
            vehicle.setEngine("123456789");
            vehicle.setChassis("123456789");
            vehicle.setYearVehicle(2021);
            vehicle.setBrand("Chevrolet");
            vehicle.setModel("Aveo");
            vehicle.setTypeVehicle(TypeVehicle.CAR);
            vehicle.setOwner(owner);
            vehicleRepository.save(vehicle);

            Owner owner2 = new Owner();
            owner2.setId("1306219583");
            owner2.setName("Geovanny");
            owner2.setLastName("Parraga");
            owner2.setAge(29);
            ownerRepository.save(owner2);

            Vehicle vehicle2 = new Vehicle();
            vehicle2.setPlate("PDF0272");
            vehicle2.setEngine("JA25E473786");
            vehicle2.setChassis("JN1CA31D3T3");
            vehicle2.setYearVehicle(2023);
            vehicle2.setBrand("Maverick");
            vehicle2.setModel("CB 125f");
            vehicle2.setTypeVehicle(TypeVehicle.BUS);
            vehicle2.setOwner(owner2);
            vehicleRepository.save(vehicle2);

        };
    }
}

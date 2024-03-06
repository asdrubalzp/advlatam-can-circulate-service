package com.advlatam.cancirculate.repositories;

import com.advlatam.cancirculate.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, String> {

    public Vehicle findByPlate(String plate);
}

package com.advlatam.cancirculate.mappers;

import com.advlatam.cancirculate.dtos.VehicleDTO;
import com.advlatam.cancirculate.models.Owner;
import com.advlatam.cancirculate.models.Vehicle;
import org.springframework.stereotype.Service;

@Service
public class VehicleMapper {
    public VehicleDTO mapToVehicleDTO(Vehicle vehicle){
        Owner owner = vehicle.getOwner();

        return new VehicleDTO(vehicle.getPlate(), vehicle.getEngine(), vehicle.getChassis(), vehicle.getYearVehicle(), vehicle.getBrand(), vehicle.getModel(), vehicle.getTypeVehicle(), vehicle.getOwner().getId(), vehicle.getCanCirculate());
    }
}

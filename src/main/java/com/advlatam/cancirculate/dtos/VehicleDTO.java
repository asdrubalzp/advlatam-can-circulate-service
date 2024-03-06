package com.advlatam.cancirculate.dtos;

import com.advlatam.cancirculate.enums.TypeVehicle;
import java.util.Date;

public record VehicleDTO(

        String plate,
        String engine,

        String chassis,
        int yearVehicle,
        String brand,
        String model,
        TypeVehicle typeVehicle,
        String ownerId,

        Boolean canCirculate
) {
}

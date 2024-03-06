package com.advlatam.cancirculate.services;

import com.advlatam.cancirculate.dtos.VehicleCirculationQueryDTO;
import com.advlatam.cancirculate.dtos.VehicleDTO;
import com.advlatam.cancirculate.mappers.VehicleMapper;
import com.advlatam.cancirculate.models.Vehicle;
import com.advlatam.cancirculate.repositories.VehicleRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {

    private final VehicleRepository vehicleRepository;
    private final VehicleMapper vehicleMapper;

    private final CanCirculateService canCirculateService;
    public VehicleService(VehicleRepository vehicleRepository, VehicleMapper vehicleMapper, CanCirculateService canCirculateService){
        this.vehicleRepository = vehicleRepository;
        this.vehicleMapper = vehicleMapper;
        this.canCirculateService = canCirculateService;
    }

    public List<VehicleDTO> findAll(){
       return vehicleRepository.findAll().stream().map(vehicleMapper::mapToVehicleDTO).toList();
    }

    public ResponseEntity<VehicleDTO> checkCanCirculate(String plate, LocalDateTime circulationDateTime) {
        Vehicle vehicle =vehicleRepository.findByPlate(plate);
        if(vehicle == null){
            return ResponseEntity.notFound().build();
        }
        boolean canCirculate = canCirculateService.canCirculate(plate, circulationDateTime);
        vehicle.setCanCirculate(canCirculate);
        vehicleRepository.save(vehicle);
        return ResponseEntity.ok(vehicleMapper.mapToVehicleDTO(vehicle));
    }

}

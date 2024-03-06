package com.advlatam.cancirculate.controllers;
import com.advlatam.cancirculate.dtos.VehicleDTO;
import com.advlatam.cancirculate.services.VehicleService;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:3000"})
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService){
        this.vehicleService = vehicleService;
    }

    @GetMapping("")
    public List<VehicleDTO> findAll() {
        return vehicleService.findAll();
    }

    @GetMapping("/can-circulate")
    public ResponseEntity<VehicleDTO> checkCanCirculate(
            @RequestParam("plate") @NotEmpty String plate,
            @RequestParam("circulationDateTime") @FutureOrPresent @NotNull LocalDateTime circulationDateTime) {
        return vehicleService.checkCanCirculate(plate, circulationDateTime);
    }
}

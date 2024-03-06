package com.advlatam.cancirculate.dtos;


import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record VehicleCirculationQueryDTO (

        @NotEmpty
        String plate,
        @FutureOrPresent @NotNull
        LocalDateTime circulationDateTime
) { }

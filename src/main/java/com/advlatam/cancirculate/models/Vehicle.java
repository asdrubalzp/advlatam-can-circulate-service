package com.advlatam.cancirculate.models;

import com.advlatam.cancirculate.enums.TypeVehicle;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Data
@Table(name = "vehicle")
public class Vehicle {

    @Id
    @Column(length = 8 )
    private String plate;

    @Column(length = 11, nullable = false, unique = true)
    private String engine;

    @Column(length = 15, nullable = false, unique = true)
    private String chassis;

    @Column(nullable = false)
    private int yearVehicle;

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private String model;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TypeVehicle typeVehicle;

    @CreationTimestamp
    @Column(updatable = false)
    private Date createdAt;

    @UpdateTimestamp
    @Column(updatable = false)
    private Date updatedAt;

    @ManyToOne
    private Owner owner;

    @Transient
    private Boolean canCirculate;

}

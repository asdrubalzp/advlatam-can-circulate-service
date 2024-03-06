package com.advlatam.cancirculate.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name = "owner")
@AllArgsConstructor
@NoArgsConstructor
public class Owner   {

    @Id
    @Column(length = 13)
    private String id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 100, nullable = false)
    private String lastName;

    @Column(nullable = false)
    private int age;

    @OneToMany(mappedBy = "owner")
    private List<Vehicle> vehicles;


}

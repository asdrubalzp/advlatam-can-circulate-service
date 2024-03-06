package com.advlatam.cancirculate.repositories;

import com.advlatam.cancirculate.models.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, String> {

}

package com.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.Entities.Vehicle;
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

}

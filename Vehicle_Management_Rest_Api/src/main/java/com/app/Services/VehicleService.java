package com.app.Services;

import java.util.List;

import com.app.Entities.Vehicle;

public interface VehicleService {
Vehicle addNewVehicle(Vehicle vehicle);

Vehicle getByCompany(Long id);

Vehicle update(Vehicle vehicle);

List<Vehicle> getAll();

void delete(Long id);


}

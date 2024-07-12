package com.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Entities.Vehicle;
import com.app.Services.VehicleService;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
	

@Autowired
private VehicleService vehicleService;

	@PostMapping()
	public ResponseEntity<String> addNewVehicle(@RequestBody Vehicle vehicle) {
		Vehicle v=vehicleService.addNewVehicle(vehicle);
		return ResponseEntity.ok("vehicle added successfully");
}
	
@GetMapping("getById/{id}")	
public Vehicle getById(@PathVariable Long id) {
	return vehicleService.getByCompany(id);
}

@PutMapping("update")
public Vehicle update(@RequestBody Vehicle vehicle) {
return vehicleService.update(vehicle);
}
	
@GetMapping("getAll/")
public List<Vehicle> getAll(){
	return vehicleService.getAll();
	
}
@DeleteMapping("delete/{id}")
public ResponseEntity<String> delete(@PathVariable Long id){
	vehicleService.delete(id);
	return ResponseEntity.ok("deleted successfully");
	
}

}
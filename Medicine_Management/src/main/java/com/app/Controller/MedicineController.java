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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.Entities.Medicine;
import com.app.Enum.Type;
import com.app.Services.MedicineService;

@RestController
@RequestMapping("/medicine")
public class MedicineController {
@Autowired
private MedicineService medicineService;

@PostMapping("insert")
public ResponseEntity<String> addNew(@RequestBody Medicine medicine){
	Medicine med=medicineService.addNew(medicine);
	return ResponseEntity.ok("medicine added"+med);
}

@GetMapping("getById/{id}")
public Medicine getById(@PathVariable  Long id) {
return medicineService.getById(id);
}

@PutMapping("update/{id}")
public ResponseEntity<String> update(@RequestBody Medicine medicine){
	Medicine med=medicineService.update(medicine);
	return ResponseEntity.ok("medicine updated are"+med);
}

@GetMapping("getAll")
public ResponseEntity<String> getAll(){
	List<Medicine> med=medicineService.getAll();
	return ResponseEntity.ok("all stoke are"+med);
}

@DeleteMapping("delete/{id}")
public ResponseEntity<String> delete(Long id){
	medicineService.delete(id);
	return ResponseEntity.ok("deleted successfully");
}

@GetMapping("/by-type")
public ResponseEntity<List<Medicine>> getMedicineByType(@RequestParam Type type) {
    List<Medicine> medicines = medicineService.getByType(type);
    if (!medicines.isEmpty()) {
        return ResponseEntity.ok(medicines);
    } else {
        return ResponseEntity.notFound().build();
    }
}

}

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

import com.app.Entities.Railway;
import com.app.Services.RailwayService;

@RestController
@RequestMapping("/railway")
public class RailwayController {
	
@Autowired
private RailwayService railwayService;

@PostMapping("/add")
public ResponseEntity<String> addNew(@RequestBody Railway railway) {
Railway ra=railwayService.addNew(railway);
return ResponseEntity.ok("Railway added successfully "+ra);
}
	
@GetMapping("getById/{id}")
 public Railway getById(@PathVariable Long id) {
return railwayService.getById(id);
}

@GetMapping("getAll")
public  ResponseEntity<String> getAllRailway( Railway railway) {
	List<Railway> rlist=railwayService.getAllRailway(railway);
	return ResponseEntity.ok("List of Railway \n"+rlist);
}

@PutMapping("update")
public Railway update(@RequestBody Railway railway) {
return railwayService.update(railway);
}

@DeleteMapping("delete/{id}")
public ResponseEntity<String> deleteById(@PathVariable Long id) {
railwayService.deleteById(id);
return ResponseEntity.ok("deleted successfully");
}

}
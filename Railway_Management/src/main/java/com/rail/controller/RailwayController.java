package com.rail.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rail.entities.Category;
import com.rail.entities.Railway;
import com.rail.service.RailwayService;

import net.bytebuddy.asm.Advice.Return;

@RestController
@RequestMapping("/railways")

public class RailwayController {

    @Autowired
    private RailwayService railwayService;

    @PostMapping
    public ResponseEntity<Railway> addNewRailway(@Valid @RequestBody Railway railway) {
        Railway createdRailway = railwayService.addNewRailway(railway);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdRailway);
    }
    
    @GetMapping("/category/{category}")
    public ResponseEntity <List<Railway>> findByCategory(@PathVariable Category category){
    	List<Railway> rai=railwayService.findByCategory(category);
    	if(rai.isEmpty()) {
    		return ResponseEntity.notFound().build();
    	}
    	return ResponseEntity.ok(rai);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRailway(@PathVariable Long id) {
        railwayService.deleteRailway(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public Railway updateRailwayDetails(@RequestBody  Railway railway) {
    	return railwayService.updateRailwayDetails(railway);
    }
    
    @GetMapping
  public   List<Railway> getAllRailways(){
    	return railwayService.getAllRailways();
    }
    
}

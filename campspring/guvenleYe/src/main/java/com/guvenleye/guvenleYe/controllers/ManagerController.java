package com.guvenleye.guvenleYe.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guvenleye.guvenleYe.entities.Manager;
import com.guvenleye.guvenleYe.service.ManagerServiceImp;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/managers")
@CrossOrigin
@RequiredArgsConstructor
public class ManagerController {
	
	private final ManagerServiceImp managerService = new ManagerServiceImp();
	
	@GetMapping
	public ResponseEntity<?> getAllManagers(){
		List<Manager> list = managerService.getAllManager();
		return new ResponseEntity<> (list,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getOneManager(@PathVariable int id){
		Manager manager = managerService.getOneManager(id);
		return new ResponseEntity<> (manager,HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> postOneManager(@RequestBody Manager manager){
		Manager manageradded = managerService.postOneManager(manager);
		return new ResponseEntity<> (manageradded,HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> putOneManager(@PathVariable int id, @RequestBody Manager manager){
		Manager managerupdated = managerService.putOneManager(id,manager);
		return new ResponseEntity<> (managerupdated,HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteOneManager(@PathVariable int id) {
		managerService.deleteOneManager(id);
		return new ResponseEntity<> (HttpStatus.NO_CONTENT);
	}
}

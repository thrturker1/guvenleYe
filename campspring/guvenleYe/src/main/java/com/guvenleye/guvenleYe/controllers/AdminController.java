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

import com.guvenleye.guvenleYe.entities.Admin;
import com.guvenleye.guvenleYe.service.AdminServiceImp;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/admins")
@CrossOrigin
@RequiredArgsConstructor
public class AdminController {

	private final AdminServiceImp adminService = new AdminServiceImp();
	
	@GetMapping
	public ResponseEntity<?> getAllAdmins() {
		List<Admin> list = adminService.getAllAdmins();
		
		return new ResponseEntity<>(list,HttpStatus.OK); 
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getOneAdmin(@PathVariable(name = "id",required = true) int id) {
		Admin admin = adminService.getOneAdmin(id);
		return new ResponseEntity<>(admin,HttpStatus.OK); 
	}
	
	@PostMapping
	public ResponseEntity<?> postOneAdmin(@RequestBody Admin admin) {
		Admin adminadded = adminService.postOneAdmin(admin);
		return new ResponseEntity<>(adminadded,HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> putOneAdmin(@PathVariable(name = "id",required = true) int id, @RequestBody Admin admin) {
		Admin adminupdated = adminService.putOneAdmin(id,admin);
		return new ResponseEntity<>(adminupdated,HttpStatus.ACCEPTED);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteOneAdmin(@PathVariable(name = "id",required = true) int id) {
		adminService.deleteOneAdmin(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}

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

import com.guvenleye.guvenleYe.entities.Foods;
import com.guvenleye.guvenleYe.service.FoodsServiceImp;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/foods")
@CrossOrigin
@RequiredArgsConstructor
public class FoodsController {
	private final FoodsServiceImp foodService = new FoodsServiceImp();
	
	@GetMapping
	public ResponseEntity<?> getAllFoods() {
		List<Foods> list = foodService.getAllFoods();
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getOneFood(@PathVariable int id) {
		Foods food = foodService.getOneFood(id);
		return new ResponseEntity<>(food,HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> postOneFood(@RequestBody Foods food) {
		Foods foodadded = foodService.postOneFood(food);
		return new ResponseEntity<>(foodadded,HttpStatus.CREATED);
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> putOneFood(@PathVariable int id, @RequestBody Foods food) {
		Foods foodupdated = foodService.putOneFood(id,food);
		return new ResponseEntity<> (foodupdated,HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteOneFood(@PathVariable int id) {
		foodService.deleteOneFood(id);
		return new ResponseEntity<> (HttpStatus.NO_CONTENT);
	}
}

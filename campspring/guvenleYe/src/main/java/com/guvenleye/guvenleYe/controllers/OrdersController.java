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

import com.guvenleye.guvenleYe.entities.Orders;
import com.guvenleye.guvenleYe.service.OrdersServiceImp;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@CrossOrigin
@RestController
@RequestMapping("/api/orders")
public class OrdersController {

	private final OrdersServiceImp orderService= new OrdersServiceImp();
	
	@GetMapping
	public ResponseEntity<?> getAllOrders(){
		
		List<Orders> list = orderService.getAllOrders();
		return new ResponseEntity<> (list,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getOneOrder(@PathVariable int id){
		Orders order = orderService.getOneOrder(id);
		return new ResponseEntity<> (order,HttpStatus.OK);
	}
	@PostMapping
	public ResponseEntity<?> postOneOrder(@RequestBody Orders order) {
		Orders orderadded = orderService.postOneOrder(order);
		return new ResponseEntity<> (orderadded, HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> putOneOrder(@PathVariable int id,@RequestBody Orders order) {
		Orders orderupdated = orderService.putOneOrder(id, order);
		return new ResponseEntity<>(orderupdated,HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteOneOrder(@PathVariable int id) {
		orderService.deleteOneOrder(id);
		return new ResponseEntity<> (HttpStatus.NO_CONTENT);
	}
	
}

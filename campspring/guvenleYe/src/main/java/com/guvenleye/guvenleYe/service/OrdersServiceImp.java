package com.guvenleye.guvenleYe.service;

import java.util.List;

import com.guvenleye.guvenleYe.entities.Orders;
import com.guvenleye.guvenleYe.repositories.OrdersRepository;
import com.guvenleye.guvenleYe.service.abstracts.OrdersService;

public class OrdersServiceImp implements OrdersService{

	public final OrdersRepository orderRepository = null;
	@Override
	public List<Orders> getAllOrders() {
		List<Orders> list = orderRepository.findAll();
		return list;
	}

	@Override
	public Orders getOneOrder(int id) {
		Orders order = orderRepository.findById(id).orElseThrow();
		return order;
	}

	@Override
	public Orders postOneOrder(Orders order) {
		
		return orderRepository.save(order);
	}

	@Override
	public Orders putOneOrder(int id, Orders order) {
		getOneOrder(id);
		order.setOrderID(id);
		return orderRepository.save(order);
	}

	@Override
	public void deleteOneOrder(int id) {
		getOneOrder(id);
		orderRepository.deleteById(id);
	}

}

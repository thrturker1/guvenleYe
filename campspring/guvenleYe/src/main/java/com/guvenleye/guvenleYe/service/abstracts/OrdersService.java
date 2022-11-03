package com.guvenleye.guvenleYe.service.abstracts;

import java.util.List;

import com.guvenleye.guvenleYe.entities.Orders;

public interface OrdersService {

	public List<Orders> getAllOrders();
	
	public Orders getOneOrder(int id);
	
	public Orders postOneOrder(Orders order);
	
	public Orders putOneOrder(int id, Orders order);
	
	public void deleteOneOrder(int id);
}

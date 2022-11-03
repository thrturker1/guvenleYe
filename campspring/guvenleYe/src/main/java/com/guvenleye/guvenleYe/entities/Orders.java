package com.guvenleye.guvenleYe.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")

public class Orders {

	@Id
	@GeneratedValue
	@Column(name = "order_id")
	private int orderID;
	
	@Column(name = "customer_name")
	private String customersName;
	
	@Column(name = "food_name")
	private String foodName;
	
	@Column(name = "order_cost")
	private double orderCost;
	
	@Column(name = "food_count")
	private int foodCount;

	
	// Getter-Setter Methods
	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public String getCustomersName() {
		return customersName;
	}

	public void setCustomersName(String customersName) {
		this.customersName = customersName;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public double getOrderCost() {
		return orderCost;
	}

	public void setOrderCost(double orderCost) {
		this.orderCost = orderCost;
	}

	public int getFoodCount() {
		return foodCount;
	}

	public void setFoodCount(int foodCount) {
		this.foodCount = foodCount;
	}
	
	
}

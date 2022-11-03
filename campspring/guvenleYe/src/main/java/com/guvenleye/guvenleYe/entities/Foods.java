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
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "foods")

public class Foods {

	@Id
	@GeneratedValue
	@Column(name = "food_id")
	private int foodID;

	@Column(name = "food_name")
	private String foodName;

	@Column(name = "food_cost")
	private double foodCost;

	@Column(name = "food_alergens")
	private String[] foodsAlergen;

	@Column(name = "seller_company")
	private String sellerCompany;

	@Column(name = "food_type")
	private String foodType;

	@Column(name = "food_count")
	private int foodCount;

	
	// Getter-Setter Methods
	public int getFoodID() {
		return foodID;
	}

	public void setFoodID(int foodID) {
		this.foodID = foodID;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public double getFoodCost() {
		return foodCost;
	}

	public void setFoodCost(double foodCost) {
		this.foodCost = foodCost;
	}

	public String[] getFoodsAlergen() {
		return foodsAlergen;
	}

	public void setFoodsAlergen(String[] foodsAlergen) {
		this.foodsAlergen = foodsAlergen;
	}

	public String getSellerCompany() {
		return sellerCompany;
	}

	public void setSellerCompany(String sellerCompany) {
		this.sellerCompany = sellerCompany;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getFoodCount() {
		return foodCount;
	}

	public void setFoodCount(int foodCount) {
		this.foodCount = foodCount;
	}

	
}

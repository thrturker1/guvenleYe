package com.guvenleye.guvenleYe.service.abstracts;

import java.util.List;

import com.guvenleye.guvenleYe.entities.Foods;

public interface FoodsService {

	public List<Foods> getAllFoods();
	
	public Foods getOneFood(int id); // get a food to which has given id
	
	public Foods postOneFood(Foods food); // post given food to table 
	
	public Foods putOneFood(int id, Foods food); // update taken food
	
	public void deleteOneFood(int id); // delete a food to witch has given id
}

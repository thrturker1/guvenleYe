package com.guvenleye.guvenleYe.service;

import java.util.List;

import com.guvenleye.guvenleYe.entities.Foods;
import com.guvenleye.guvenleYe.repositories.FoodsRepository;
import com.guvenleye.guvenleYe.service.abstracts.FoodsService;

public class FoodsServiceImp implements FoodsService{

	public final FoodsRepository foodsRepository = null;
	
	@Override
	public List<Foods> getAllFoods(){
		List<Foods> list = foodsRepository.findAll(); 
		return list;
	}
	
	@Override
	public Foods getOneFood(int id) {
		Foods food = foodsRepository.findById(id).orElseThrow();
		return food; 
	}
	
	@Override
	public Foods postOneFood(Foods food) {
		
		return foodsRepository.save(food);
	}
	
	@Override
	public Foods putOneFood(int id, Foods food) {
		getOneFood(id);
		food.setFoodID(id);
		return foodsRepository.save(food);
	}
	
	@Override
	public void deleteOneFood(int id) {
		getOneFood(id);
		foodsRepository.deleteById(id);
	}

}

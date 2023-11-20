package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Meal;
import com.example.demo.entity.MealId;

@Repository
public interface MealDao extends JpaRepository<Meal, MealId>{

	//����j�M���G�^�ǵ��� ��̬ۦP
	public List<Meal> findTop2ByName(String name);
	public List<Meal> findFirst2ByName(String name);
	
	//�Ƨ�:�w�] ASC
	//ASC:�Ѥp��j  DESC:�Ѥj��p
	public List<Meal> findAllByOrderByPrice();
	
	public List<Meal> findAllByOrderByPriceDesc();
	
	public List<Meal> findByNameOrderByPrice(String name);
	
	//����j�p
	//1.�j��:GreaterThan
	//2.�j�󵥩�:GreaterThanEqual
	//3.�p��:LessThan
	//4.�p�󵥩�:LessThanEqual
	public List<Meal> findByPriceGreaterThan(int price);
	
	//�h��+����j�p
	public List<Meal> findByNameAndPriceGreaterThan(String name, int price);

	//containing �]�t
	public List<Meal> findByNameContaining(String name);
	
	public List<Meal> findByNameContainingAndCookingStyleContaining(String name, String cookingStyle);
	
	//between ���]�t�W�U��
	public List<Meal> findByPriceBetween(int price1, int price2);
	
	//in
	public List<Meal> findByPriceIn(List<Integer> priceList);
	
	//notIn
	public List<Meal> findByPriceNotIn(List<Integer> priceList);
}

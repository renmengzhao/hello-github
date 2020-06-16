package com.ren.builder;

import com.ren.builder.entity.ChickenBurger;
import com.ren.builder.entity.Coke;
import com.ren.builder.entity.Meal;
import com.ren.builder.entity.VegBurger;

public class MealBuilder {

	public static Meal getMeal1() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		meal.addItem(new ChickenBurger());
		return meal;
	}

	public static void main(String[] args) {
		Meal meal = getMeal1();
		System.out.println(meal.getCost());	
		meal.showItems();
	}
}

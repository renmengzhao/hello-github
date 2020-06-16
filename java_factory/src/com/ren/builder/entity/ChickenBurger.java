package com.ren.builder.entity;

public class ChickenBurger extends Burger{

	private String name = "Chicken Burger";
	
	private float price = 32.0f;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
}

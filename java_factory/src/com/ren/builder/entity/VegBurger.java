package com.ren.builder.entity;

public class VegBurger extends Burger{

	private float price = 12.0f;
	
	private String name = "veg burger";

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

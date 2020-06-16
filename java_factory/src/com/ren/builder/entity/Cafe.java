package com.ren.builder.entity;

public class Cafe extends ColdDrink{

	private float price = 1.5f;
	
	private String name = "ka fei";

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

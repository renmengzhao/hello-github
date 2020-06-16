package com.ren.builder.entity.base;

public abstract class Item {

	private float price;
	
	private String name;
	
	public abstract Packing packing();

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

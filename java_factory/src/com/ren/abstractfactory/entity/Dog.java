package com.ren.abstractfactory.entity;

public class Dog extends Animal{

	@Override
	public String love() {
		return "狗子求偶";
	}

	@Override
	public String eat() {		
		return "狗子吃骨头";
	}

}

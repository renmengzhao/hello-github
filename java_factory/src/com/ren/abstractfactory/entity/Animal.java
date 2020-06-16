package com.ren.abstractfactory.entity;

public abstract class Animal {

	private int age;
	
	public abstract String love();
	
	public abstract String eat();

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

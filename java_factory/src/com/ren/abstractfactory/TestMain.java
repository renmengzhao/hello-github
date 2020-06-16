package com.ren.abstractfactory;

import com.ren.abstractfactory.entity.Animal;
import com.ren.abstractfactory.factory.AnimalFactory;
import com.ren.abstractfactory.factory.FactoryProducer;

public class TestMain {

	public static void main(String[] args) {
		AnimalFactory factory = FactoryProducer.getFactry("dog");
		Animal dog = factory.getDog();
		System.out.println(dog.getAge()+ "" + dog.eat());	
	}
}

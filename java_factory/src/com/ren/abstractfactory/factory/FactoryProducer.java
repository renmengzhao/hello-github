package com.ren.abstractfactory.factory;

public class FactoryProducer {

	public static AnimalFactory getFactry(String type) {
		
		switch (type) {
			case "dog":
				return new DogFactory();
			case "fish":
				return new FishFactory();
				
			default:
				return null;
		}
	}
}

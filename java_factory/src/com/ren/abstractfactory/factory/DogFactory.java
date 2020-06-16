package com.ren.abstractfactory.factory;

import com.ren.abstractfactory.entity.Dog;
import com.ren.abstractfactory.entity.Fish;

public class DogFactory extends AnimalFactory{

	@Override
	public Dog getDog() {
		return new Dog();
	}

	@Override
	public Fish getFish() {
		return null;
	}
}

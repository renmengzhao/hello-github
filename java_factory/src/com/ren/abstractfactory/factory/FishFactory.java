package com.ren.abstractfactory.factory;

import com.ren.abstractfactory.entity.Dog;
import com.ren.abstractfactory.entity.Fish;

public class FishFactory extends AnimalFactory{

	@Override
	public Dog getDog() {
		return null;
	}

	@Override
	public Fish getFish() {
		return new Fish();
	}
}

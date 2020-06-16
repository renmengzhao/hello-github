package com.ren.abstractfactory.factory;

import com.ren.abstractfactory.entity.Dog;
import com.ren.abstractfactory.entity.Fish;

public abstract class AnimalFactory {

	public abstract Dog getDog();
	
	public abstract Fish getFish();
}

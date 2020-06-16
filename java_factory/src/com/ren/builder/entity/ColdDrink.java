package com.ren.builder.entity;

import com.ren.builder.entity.base.Item;
import com.ren.builder.entity.base.Packing;

public abstract class ColdDrink extends Item{

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}	
}

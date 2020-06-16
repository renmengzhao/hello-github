package com.ren.builder.entity;

import com.ren.builder.entity.base.Item;
import com.ren.builder.entity.base.Packing;

public abstract class Burger extends Item{

	@Override
	public Packing packing() {
		return new Wrapper();
	}	
}

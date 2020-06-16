package com.ren.builder.entity;

import java.util.ArrayList;
import java.util.List;

import com.ren.builder.entity.base.Item;

public class Meal {

	List<Item> items = new ArrayList<Item>();

	public void addItem(Item item) {
		items.add(item);
	}

	public float getCost() {
		float cost = 0.0f;
		for (Item item : items) {
			cost += item.getPrice();
		}
		return cost;
	}

	public void showItems() {
		for (Item item : items) {
			System.out.print("Item : " + item.getName());
			System.out.print(", Packing : " + item.packing().pack());
			System.out.println(", Price : " + item.getPrice());
		}
	}
}

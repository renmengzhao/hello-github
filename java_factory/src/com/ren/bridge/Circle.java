package com.ren.bridge;

import com.ren.bridge.inter.ColorCircle;
import com.ren.bridge.inter.DrawAPI;
import com.ren.bridge.inter.Shape;

public class Circle extends Shape{

	private int radius, x, y;
	
	public Circle(int radius, int x, int y, DrawAPI drawAPI) {
		super(drawAPI);
		this.radius = radius;	
		this.x = x;
		this.y = y;
	}
	
	public void drawCircle() {
		drawAPI.drawCircle(radius, x, y);
	}

	public void drawRect() {
		
	}
	
	public static void main(String[] args) {
		Shape redCircle = new Circle(3, 4, 5, new ColorCircle());
		
		// 由抽象部分进行组合聚合，在各自抽象的维度上独立的扩展，最终灵魂（一个主维度）委派肉体（被引用的抽象维度）实现真实的功能
		redCircle.drawCircle();
	}

	public int getRedius() {
		return radius;
	}

	public void setRedius(int radius) {
		this.radius = radius;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}	
}

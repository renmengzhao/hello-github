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
		
		// �ɳ��󲿷ֽ�����Ͼۺϣ��ڸ��Գ����ά���϶�������չ��������꣨һ����ά�ȣ�ί�����壨�����õĳ���ά�ȣ�ʵ����ʵ�Ĺ���
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

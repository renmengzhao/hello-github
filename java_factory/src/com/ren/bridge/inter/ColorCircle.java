package com.ren.bridge.inter;

public class ColorCircle implements DrawAPI {
	
	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: red, radius: "
		         + radius +", x: " +x+", "+ y +"]");
	}

	@Override
	public void drawRect(int width, int high) {
		
	}

}

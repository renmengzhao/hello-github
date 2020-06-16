package com.ren.bridge.inter;

public abstract class Shape {

	protected DrawAPI drawAPI;
	
	public Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}
	
	public abstract void drawCircle();
	
	public abstract void drawRect();

	public DrawAPI getDrawAPI() {
		return drawAPI;
	}

	public void setDrawAPI(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}	
}

package com.pavan;

public class Bread {
	private String breadType;
	private int caloriesPerSlice;
	private String colour;
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getBreadType() {
		return breadType;
	}
	public void setBreadType(String breadType) {
		this.breadType = breadType;
	}
	public int getCaloriesPerSlice() {
		return caloriesPerSlice;
	}
	public void setCaloriesPerSlice(int caloriesPerSlice) {
		this.caloriesPerSlice = caloriesPerSlice;
	}
	public Bread(String breadType, int caloriesPerSlice) {
		super();
		this.breadType = breadType;
		this.caloriesPerSlice = caloriesPerSlice;
	}
	public Bread() {}

}

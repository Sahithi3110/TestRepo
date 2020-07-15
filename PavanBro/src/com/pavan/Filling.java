package com.pavan;

public class Filling {
	private String fillingType;
	private int caloriesPerServing;
	public String getFillingType() {
		return fillingType;
	}
	public void setFillingType(String fillingType) {
		this.fillingType = fillingType;
	}
	public int getCaloriesPerServing() {
		return caloriesPerServing;
	}
	public void setCaloriesPerServing(int caloriesPerServing) {
		this.caloriesPerServing = caloriesPerServing;
	}
	public Filling(String fillingType, int caloriesPerServing) {
		super();
		this.fillingType = fillingType;
		this.caloriesPerServing = caloriesPerServing;
	}
	public Filling() {}

}

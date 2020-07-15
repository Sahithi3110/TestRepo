package com.pavan;

public class Sandwich {
 private Bread bread;
 private Filling filling;
public Bread getBread() {
	return bread;
}
public void setBread(Bread bread) {
	this.bread = bread;
}
public Filling getFilling() {
	return filling;
}
public void setFilling(Filling filling) {
	this.filling = filling;
}
public Sandwich(Bread bread, Filling filling) {
	super();
	this.bread = bread;
	this.filling = filling;
}
public Sandwich() {}
}

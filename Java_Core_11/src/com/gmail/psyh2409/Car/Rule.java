package com.gmail.psyh2409.Car;

public class Rule {

	private double diameter;
	private String material;
	
	public Rule(double diameter, String material) {
		this.setDiameter(diameter);
		this.setMaterial(material);
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	@Override
	public String toString() {
		return "Rule [diameter=" + diameter + ", material=" + material + "]";
	}

	
}

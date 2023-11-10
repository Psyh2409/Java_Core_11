package com.gmail.psyh2409.Avto;

public class Rule {

	private double diameter;
	private String matherial;
	
	public Rule(double diameter, String matherial) {
		this.setDiameter(diameter);
		this.setMatherial(matherial);
	}

	public String getMatherial() {
		return matherial;
	}

	public void setMatherial(String matherial) {
		this.matherial = matherial;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	@Override
	public String toString() {
		return "Rule [diameter=" + diameter + ", matherial=" + matherial + "]";
	}

	
}

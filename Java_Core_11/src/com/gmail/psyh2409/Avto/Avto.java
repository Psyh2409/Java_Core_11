package com.gmail.psyh2409.Avto;

public class Avto {
	private double horsepower;
	private int year;
	private Rule rule;
	private Engine engine;
	
	public Avto() {
		setHorsepower((Math.random()*200));
		setYear((int) (1900 + Math.random()*(2023 - 1900)));
		setRule(new Rule((50 * Math.random()), "leather"));
		setEngine(new Engine((int)(10*Math.random())));
	}

	public Rule getRule() {
		return rule;
	}

	public void setRule(Rule rule) {
		this.rule = rule;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public double getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(double horsepower) {
		this.horsepower = horsepower;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Avto [horsepower=" + horsepower + 
				", year=" + year + ", rule=" + rule + 
				", engine=" + engine + "]";
	}
	
}

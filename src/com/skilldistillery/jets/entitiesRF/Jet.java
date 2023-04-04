package com.skilldistillery.jets.entitiesRF;

public abstract class Jet {
	private String model;
	
	private double speed;
	
	private int range;
	
	private long price;

	public Jet(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	
	public void fly() {
		System.out.println("flying!");
	}
	
	public String timeToTrav() {
		double time = range / speed;

		return " can fly for " + time + " hours until it runs out of fuel.";

	}
	
	public double detSpeedInMach() {
		return 0.0;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Jet [Model: " + model + ", Speed: " + speed + ", Range: " + range + ", Price: " + price + "]";
	}
	
	
	

}

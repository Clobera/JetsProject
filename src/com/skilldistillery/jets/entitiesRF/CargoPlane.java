package com.skilldistillery.jets.entitiesRF;

public class CargoPlane extends Jet implements CargoCarrier, Communications{

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void userRadios() {
		System.out.println("**USING RADIO**");
		
	}

	@Override
	public void intercom() {
		System.out.println("**USING RADIO**");
		
		
	}

	@Override
	public void loadCargo() {
		System.out.println("**LOADING CARGO**");
		
	}

	@Override
	public void unloadCargo() {
		System.out.println("**UNLOADING CARGO**");
		
	}

}

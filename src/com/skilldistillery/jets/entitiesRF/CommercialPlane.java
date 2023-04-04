package com.skilldistillery.jets.entitiesRF;

public class CommercialPlane extends Jet implements PassengerCare, Communications {

	public CommercialPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void userRadios() {
		System.out.println("**USING RADIO**");

	}

	@Override
	public void intercom() {
		System.out.println("**USING INTERCOM**");

	}

	@Override
	public void loadPassenger() {
		System.out.println("**LOADING PASSENGERS**");

	}

	@Override
	public void attendPassenger() {
		System.out.println("**ATTENDING PASSENGERS**");

	}

}

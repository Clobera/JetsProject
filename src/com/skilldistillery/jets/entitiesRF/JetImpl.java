package com.skilldistillery.jets.entitiesRF;

public class JetImpl extends Jet implements Communications{

	public JetImpl(String model, double speed, int range, long price) {
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
	

}

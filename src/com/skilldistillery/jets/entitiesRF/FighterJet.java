package com.skilldistillery.jets.entitiesRF;

public class FighterJet extends Jet implements CombatReady, Communications {

	public FighterJet(String model, double speed, int range, long price) {
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
	public void fight() {
		System.out.println("**SHOOOOOOOOOOOTING**");

	}

	@Override
	public void reLoad() {
		System.out.println("**RELOADING**");

	}

}

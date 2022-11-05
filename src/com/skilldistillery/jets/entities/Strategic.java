package com.skilldistillery.jets.entities;

public class Strategic extends Jet implements Fighter, CommSystems, NavSystems{

	
	
	public Strategic(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void shootGuns() {
		System.out.println("Shooting guns!! *pew pew pew pew*");
		
	}

	@Override
	public void useGPS() {
		System.out.println("Initializing GPS system");
		System.out.println("Using Gps system");
		
		
	}

	@Override
	public void useRadios() {
		System.out.println("*Utilizing Radios*");
		System.out.println("Pilot: \"Target accuired\" ");
		System.out.println("Comm Tower: \"Go ahead and take out that giant teddybear\" ");
		System.out.println("Pilot: \"Rodger over and out.\" ");
		
	}
}

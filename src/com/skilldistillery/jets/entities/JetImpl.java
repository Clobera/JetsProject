package com.skilldistillery.jets.entities;

public class JetImpl extends Jet implements  CommSystems, NavSystems{

	public JetImpl(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	
	@Override
	public void useGPS() {
		System.out.println("*Initializing GPS system*");
		System.out.println("*Using Gps system*");		
	}

	@Override
	public void useRadios() {
		System.out.println("*Utilizing Radios*");
		System.out.println("Pilot: \"LAX airport this is aircraft 4040 preparing to land.\"");
		System.out.println("Tower: \"proceed to runway 44E.\"");
		System.out.println("Pilot: \"Lima Charlie\"");
	}
	

}

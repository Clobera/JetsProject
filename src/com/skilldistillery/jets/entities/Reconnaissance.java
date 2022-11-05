package com.skilldistillery.jets.entities;

public class Reconnaissance extends Jet implements CommSystems, NavSystems, RadarSystems, IntelRelayer{

	public Reconnaissance(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void relayIntel() {
		System.out.println("*Gathering intel*");
		System.out.println("*sending intel*");
		
	}

	@Override
	public void useRadar() {
		System.out.println("*Initializing Radars*");
		System.out.println("*Radar scanning surrounfings*");
		
	}

	@Override
	public void useGPS() {
		System.out.println("*Initializing GPS system*");
		System.out.println("*Using Gps system*");
		
	}

	@Override
	public void useRadios() {
		System.out.println("*Utilizing Radios*");
		System.out.println("Pilot: \"We have the information. perssion to return to wily wonkas factory?\" ");
		System.out.println("Comm: \"Permission Granted. Use runway 3B.\" ");
		System.out.println("Comm: \"Lima Charlie\" ");
		
	}
	
}

package com.skilldistillery.jets.entities;

public class Cargo extends Jet implements CargoCarrier, CommSystems, NavSystems, MissionPersonelTransport{

	
	public Cargo(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void loadTroops() {
		System.out.println("*Loading Troops*");
		System.out.println("*Troops loaded*");		
	}

	@Override
	public void useGPS() {
		System.out.println("Initializing GPS system");
		System.out.println("Using Gps system");
		
	}

	@Override
	public void useRadios() {
		System.out.println("*Utilizing Radios*");
		System.out.println("Pilot: \"We have the goods. perssion to return to land?\" ");
		System.out.println("Comm: \"Permission Granted. Use runway 3B.\" ");
		System.out.println("Comm: \"Lima Charlie\" ");
				 
	}

	@Override
	public void loadCargo() {
		System.out.println("*Loading Cargo*");
		System.out.println("*Cargo Loaded*");		
	}
}

package com.skilldistillery.jets.entities;

public class Commercial extends Jet implements CivillianTransport, CargoCarrier, CustomerService, CommSystems, NavSystems{
	
	
	
	public Commercial(String model, double speed, int range, long price) {
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

	@Override
	public void attendPassengers() {
		System.out.println("*Ding Ding*");
		System.out.println("Flight attendant: \"How may i help you?\"");
		System.out.println("Passenger: \"i would like a bag of peanuts.\"");
		System.out.println("Flight attendant: *gives bag of peanuts* ");
		
		
	}

	@Override
	public void loadCargo() {
		System.out.println("*Loading Cargo*");
		System.out.println("*Cargo Loaded*");
		
	}

	@Override
	public void loadCivillianPassengers() {
		System.out.println("*Loading passengers*");
		System.out.println("*Passengers loaded*");
		
	}

}

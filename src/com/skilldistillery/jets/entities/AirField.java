package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AirField {
//no main

	private ArrayList<Jet> fleet = new ArrayList<>(); 
	
	public void createFleetFromFile() {

		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] jetLines = line.split(",");

				String catagory = jetLines[0];
				String model = jetLines[1];
				double speed = Double.parseDouble(jetLines[2]);
				int range = Integer.parseInt(jetLines[3]);
				long price = Long.parseLong(jetLines[4]);

				if (catagory.equals("Fighter")) {
					fleet.add(new Strategic(model, speed, range, price));
				}else if (catagory.equals("Bomber")) {
					fleet.add(new Reconnaissance(model, speed, range, price));
				}else if (catagory.equals("Cargo")) {
					fleet.add(new Cargo(model, speed, range, price));
				}else if (catagory.equals("Passenger")) {
					fleet.add(new Commercial(model, speed, range, price));
				}


			}
		} catch (IOException e) {
			System.err.println(e);
		}

		
	}
	
	public int fleetSize() {
		return this.fleet.size();
	}
	
	public void listFleet() {
		for(int i = 0 ; i< fleet.size() ; i++ ) {
			System.out.println(fleet.get(i).toString());
		}
	}
	
	public void flyJets() {
		for(int i = 0 ; i< fleet.size() ; i++ ) {
			fleet.get(i).fly();
		}
		
	}
	
	public void loadCargoJets() {
		for(int i = 0 ; i< fleet.size() ; i++ ) {
			if(fleet.get(i) instanceof CargoCarrier) {
				((CargoCarrier) fleet.get(i)).loadCargo();
			}
		}
	}
	
	public void dogFight() {
		for(int i = 0 ; i< fleet.size() ; i++ ) {
			if(fleet.get(i) instanceof Strategic) {
				((Strategic) fleet.get(i)).shootGuns();
			}
		}
		
	}
	public void fastestJet() {
		String fastJet = "";
		double fastSpeed = 0.0;
		
		for(int i = 0 ; i< fleet.size() ; i++ ) {
			if(fastSpeed < fleet.get(i).getRange()) {
				fastSpeed = fleet.get(i).getRange();
				fastJet = fleet.get(i).toString();
				
			}
		}
		System.out.println("The fastest jet is " + fastJet);
	}
	


}

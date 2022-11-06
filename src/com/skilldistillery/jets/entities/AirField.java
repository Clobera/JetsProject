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
				} else if (catagory.equals("Bomber")) {
					fleet.add(new Reconnaissance(model, speed, range, price));
				} else if (catagory.equals("Cargo")) {
					fleet.add(new Cargo(model, speed, range, price));
				} else if (catagory.equals("Passenger")) {
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
		for (int i = 0; i < fleet.size(); i++) {
			System.out.println(fleet.get(i).toString());
		}
	}

	public void flyJets() {
		for (int i = 0; i < fleet.size(); i++) {
			if (fleet.get(i) instanceof Jet) {
				System.out.println((Jet) fleet.get(i));
				System.out.println(fleet.get(i).distance());
				fleet.get(i).fly();
				System.out.println();
			}
		}

	}

	public void loadCargoJets() {
		for (int i = 0; i < fleet.size(); i++) {
			if (fleet.get(i) instanceof CargoCarrier) {
				System.out.println((CargoCarrier) fleet.get(i));
				((CargoCarrier) fleet.get(i)).loadCargo();
			}
		}
	}

	public void dogFight() {
		for (int i = 0; i < fleet.size(); i++) {
			if (fleet.get(i) instanceof Strategic) {
				System.out.println((Strategic) fleet.get(i));
				((Strategic) fleet.get(i)).shootGuns();
			}
		}

	}

	public void fastestJet() {
		String fastJet = "";
		double fastSpeed = 0.0;

		for (int i = 0; i < fleet.size(); i++) {
			if (fastSpeed < fleet.get(i).getSpeed()) {
				fastSpeed = fleet.get(i).getSpeed();
				fastJet = fleet.get(i).toString();

			}
		}
		System.out.println("The fastest jet is: " + fastJet);
	}

	public void longestRangeJet() {
		String longestRangeJet = "";
		double longRange = 0.0;

		for (int i = 0; i < fleet.size(); i++) {
			if (longRange < fleet.get(i).getRange()) {
				longRange = fleet.get(i).getRange();
				longestRangeJet = fleet.get(i).toString();

			}
		}
		System.out.println("The jet with the longest Range is: " + longestRangeJet);
	}

	public void addJet(String catagory, String model, double speed, int range, long price) {

		if (catagory.equalsIgnoreCase("Cargo")) {
			fleet.add(new Cargo(model, speed, range, price));

		} else if (catagory.equalsIgnoreCase("Strategic")) {
			fleet.add(new Strategic(model, speed, range, price));

		} else if (catagory.equalsIgnoreCase("Bomber")) {
			fleet.add(new Reconnaissance(model, speed, range, price));

		} else if (catagory.equalsIgnoreCase("Commercial")) {
			fleet.add(new Commercial(model, speed, range, price));

		} else if (catagory.equalsIgnoreCase("JetImpl")) {
			fleet.add(new JetImpl(model, speed, range, price));

		}

	}

	public void removeJetMenu() {
		for (int i = 0; i < fleet.size(); i++) {
			System.out.println(i + ".) " + fleet.get(i).toString());
		}

	}

	public void removeJet(int choice) {
		for (int i = 0; i < fleet.size(); i++) {
			if (fleet.get(choice) == fleet.get(i)) {
				fleet.remove(i);
			}

		}

	}

}

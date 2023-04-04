package com.skilldistillery.jets.entitiesRF;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AirFieldRF {
	private ArrayList<Jet> fleet = new ArrayList<>();

	public void createFleetFromFile() {
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jetsRF.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] jetLines = line.split(",");

				String catagory = jetLines[0];
				String model = jetLines[1];
				double speed = Double.parseDouble(jetLines[2]);
				int range = Integer.parseInt(jetLines[3]);
				long price = Long.parseLong(jetLines[4]);

				if (catagory.equals("Fighter")) {
					fleet.add(new FighterJet(model, speed, range, price));
				} else if (catagory.equals("Commercial")) {
					fleet.add(new CommercialPlane(model, speed, range, price));
				} else if (catagory.equals("Cargo")) {
					fleet.add(new CargoPlane(model, speed, range, price));
				}

			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	// USER 5
	public void listFleet() {
		for (Jet jet : fleet) {
			System.out.println(jet.toString());
		}
		System.out.println();
		System.out.println();
	}

	// USER 6
	public void flyAll() {
		for (Jet jet : fleet) {
			System.out.println(jet.getModel() + jet.timeToTrav());
			jet.fly();
		}
		System.out.println();
		System.out.println();
	}

	// USER 7
	public void showFastJet() {
		String fastJet = "";
		double fastSpeed = 0.0;

		for (int i = 0; i < fleet.size(); i++) {
			if (fastSpeed < fleet.get(i).getSpeed()) {
				fastSpeed = fleet.get(i).getSpeed();
				fastJet = fleet.get(i).getModel();

			}
		}
		System.out.println("The fastest jet is: " + fastJet);
		System.out.println();
		System.out.println();
	}

	public void longestRange() {
		String fastJet = "";
		int longRange = 0;

		for (int i = 0; i < fleet.size(); i++) {
			if (longRange < fleet.get(i).getRange()) {
				longRange = fleet.get(i).getRange();
				fastJet = fleet.get(i).getModel();
			}
		}
		System.out.println("The jet that has the largest range is: " + fastJet);
		System.out.println();
		System.out.println();
	}

	// USER 8

	public void loadCargo() {
		for (Jet jet : fleet) {
			if (jet instanceof CargoCarrier) {
				System.out.println(jet.getModel());
				((CargoCarrier) jet).loadCargo();
			}
		}
		System.out.println();
		System.out.println();
	}

	public void dogfight() {
		for (Jet jet : fleet) {
			if (jet instanceof CombatReady) {
				System.out.println(jet.getModel());
				((CombatReady) jet).fight();
				((CombatReady) jet).reLoad();
			}
		}
		System.out.println();
		System.out.println();
	}

	// USER 9
	public void addJet(Scanner sc) {
		int userChoice = 0;
		String model = "";
		double speed = 0;
		int range = 0;
		long price = 0;
		boolean keepGoing = true, keepGoing2 = true, keepGoing3 = true, keepGoing4 = true;
		while (keepGoing) {
			try {
				System.out.println("       Lets add a jet to the fleet!");
				System.out.println("");
				System.out.println("");
				System.out.println("************** CHOOSE TYPE **************");
				System.out.println("*  1.) CARGO                            *");
				System.out.println("*  2.) FIGHTER                          *");
				System.out.println("*  3.) COMMERCIAL                       *");
				System.out.println("*  4.) BASIC                            *");
				System.out.println("*****************************************");

				userChoice = sc.nextInt();
				keepGoing = false;
				sc.nextLine();

			} catch (Exception e) {
				System.out.println("** PLEASE ENTER A VALID NUMBER BETWEEN 1-4 **");
				sc.nextLine();
			}
		}

		System.out.println("");
		System.out.println("");
		System.out.println("************** ENTER MODEL **************");
		model = sc.nextLine();

		while (keepGoing2) {
			try {
				System.out.println("");
				System.out.println("");
				System.out.println("************** ENTER SPEED **************");
				speed = sc.nextDouble();
				keepGoing2 = false;
				sc.nextLine();

			} catch (Exception e) {
				System.out.println("** PLEASE ENTER A VALID NUMBER **");
				sc.nextLine();
			}
		}

		while (keepGoing3) {
			try {
				System.out.println("");
				System.out.println("");
				System.out.println("************** ENTER RANGE **************");
				range = sc.nextInt();
				keepGoing3 = false;
				sc.nextLine();

			} catch (Exception e) {
				System.out.println("** PLEASE ENTER A VALID INTEGER NUMBER (NO DECIMALS) **");
				sc.nextLine();
			}
		}
		while (keepGoing4) {
			try {
				System.out.println("");
				System.out.println("");
				System.out.println("************** ENTER PRICE **************");
				price = sc.nextLong();
				keepGoing4 = false;
				sc.nextLine();

			} catch (Exception e) {
				System.out.println("** PLEASE ENTER A VALID INTEGER NUMBER (NO DECIMALS ROUND UP) **");
				sc.nextLine();
			}
		}

		if (userChoice == 1) {
			fleet.add(new CargoPlane(model, speed, range, price));

		} else if (userChoice == 2) {
			fleet.add(new FighterJet(model, speed, range, price));

		} else if (userChoice == 3) {
			fleet.add(new CommercialPlane(model, speed, range, price));

		} else if (userChoice == 4) {
			fleet.add(new JetImpl(model, speed, range, price));

		}

	}

	// USER 10
	public void removeJet(Scanner sc) {
		int userChoice = 0;
		boolean keepGoing = true;

		System.out.println("************** WHICH JET WOULD YOU LIKE TO DELETE? **************");
		for (int i = 0; i < fleet.size(); i++) {
			System.out.println((i + 1) + ".) " + fleet.get(i).toString());
		}
		while (keepGoing) {

			try {
				userChoice = sc.nextInt();
				fleet.remove(userChoice - 1);
				keepGoing = false;
				sc.nextLine();
			} catch (Exception e) {
				System.out.println("**ERROR- INVALID INPUT** PLEASE ENTER A NUMBER ON THE MENU OF JETS");
				System.out.println("PLEASE TRY AGAIN.");
				sc.nextLine();
			}
		}

	}

}

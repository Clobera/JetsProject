package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;

public class JetsApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean keepGoing = true;
		AirField af = new AirField();

		af.createFleetFromFile();

		System.out.println("Hello hooman! Please choose from the following menu. (Enter a number):");

		while (keepGoing) {
			System.out.println();
			System.out.println("1.) LIST FLEET");
			System.out.println("2.) FLY ALL JETS");
			System.out.println("3.) VIEW FASTEST JET");
			System.out.println("4.) VIEW JET WITH LONGEST RANGE");
			System.out.println("5.) LOAD ALL CARGO JETS");
			System.out.println("6.) DOGFIGHT!!");
			System.out.println("7.) ADD A JET TO THE FLEET");
			System.out.println("8.) REMOVE A JET FROM THE FLEET");
			System.out.println("9.) QUIT");
			int menuChoice = sc.nextInt();
			sc.nextLine();

			if (menuChoice == 1) {
				af.listFleet();

			} else if (menuChoice == 2) {
				af.flyJets(); // STILL NEED TO DO STUFF LOOK AT STRUCTURE

			} else if (menuChoice == 3) {
				af.fastestJet();

			} else if (menuChoice == 4) {
				af.longestRangeJet();

			} else if (menuChoice == 5) {
				af.loadCargoJets();

			} else if (menuChoice == 6) {
				af.dogFight();

			} else if (menuChoice == 7) {
				System.out.println(
						"What kind of jet do you want to add?(Cargo, Strategic, Commercial, Bomber, or JetImpl): ");
				String catagory = sc.nextLine();
				System.out.println("Please enter model: ");
				String model = sc.nextLine();
				System.out.println("Please enter speed: ");
				double speed = sc.nextDouble();
				sc.nextLine(); // flush?
				System.out.println("Please enter range: ");
				int range = sc.nextInt();
				sc.nextLine(); // flush?
				System.out.println("Please enter price: ");
				long price = sc.nextLong();
				sc.nextLine(); // flush?

				af.addJet(catagory, model, speed, range, price);
				System.out.println("You've added a jet!");

			} else if (menuChoice == 8) {
				af.removeJetMenu();
				System.out.println("Enter number of jet you want to remove!(ONLY NUMBER): ");
				int choice = sc.nextInt();
				sc.nextLine();
				af.removeJet(choice);
				System.out.println("You've removed a jet!");

			} else if (menuChoice == 9) {
				System.out.println("Goodbye! Come again!");
				keepGoing = false;

			} else {
				System.out.println("Invalid choice. Enter a number from the menu!");
			}

		}
		sc.close();
	} // end main method

}

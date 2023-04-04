package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entitiesRF.AirFieldRF;

public class JetsApplicationRF {
	Scanner sc = new Scanner(System.in);
	AirFieldRF airField = new AirFieldRF();

	public static void main(String args[]) {
		JetsApplicationRF ja = new JetsApplicationRF();

		ja.airField.createFleetFromFile();
		ja.launch();
	}

	private void launch() {
		int userInput = 0;
		boolean keepGoing = true;
		while (keepGoing) {
			boolean isError = true;
			while (isError) {
				try {
					displayUserMenu();
					userInput = sc.nextInt();
					sc.nextLine();
					isError = false;

				} catch (Exception e) {
					System.out.println("**ERROR- INVALID INPUT** PLEASE ENTER A VALID NUMBER BETWEEN 1-9");
					System.out.println();
					System.out.println();
					sc.nextLine();
				}
			}

			if (userInput == 1) {
				airField.listFleet();
			} else if (userInput == 2) {
				airField.flyAll();;

			} else if (userInput == 3) {
				airField.showFastJet();

			} else if (userInput == 4) {
				airField.longestRange();

			} else if (userInput == 5) {
				airField.loadCargo();

			} else if (userInput == 6) {
				airField.dogfight();

			} else if (userInput == 7) {
				airField.addJet(sc);

			} else if (userInput == 8) {
				airField.removeJet(sc);				

			} else if (userInput == 9) {
				System.out.println("GOODBYE! HAVE A GOOD DAY");
				keepGoing = false;
				sc.close();
				System.exit(0);
			}
		}

	}

	private void displayUserMenu() {
		System.out.println("         WELCOME TO LOLO AIRLINES!       ");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("****************** MENU ******************");
		System.out.println("*  1.) LIST FLEET                        *");
		System.out.println("*  2.) FLY ALL JETS                      *");
		System.out.println("*  3.) VIEW FASTEST JET                  *");
		System.out.println("*  4.) VIEW JET WITH THE LONGEST RANGE   *");
		System.out.println("*  5.) LOAD ALL CARGO JETS               *");
		System.out.println("*  6.) DOGFIGHT!!                        *");
		System.out.println("*  7.) ADD A JET TO FLEET                *");
		System.out.println("*  8.) REMOVE A JET FROM FLEET           *");
		System.out.println("*  9.) QUIT                              *");
		System.out.println("******************************************");
	}

}

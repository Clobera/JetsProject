package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AirField {
//no main

	private ArrayList<Jet> fleet = new ArrayList<>();

	// below copy and paste frim bookmaark
	public void getFileNames() {

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
				}

				System.out.println(line);

			}
		} catch (IOException e) {
			System.err.println(e);
		}

	}

	// REFER TO FILE IN HEREEEEEE
}

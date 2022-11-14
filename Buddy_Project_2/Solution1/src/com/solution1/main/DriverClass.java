package com.solution1.main;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.solution1.skyscraper.Skyscraper;

public class DriverClass {
	
	public static void main(String[] args) {

		// declaring input variable
		List<Integer> floors = new LinkedList<>();

		Skyscraper skyscraper = new Skyscraper();
		Scanner sc = new Scanner(System.in);

		// getting floor inputs from user
		System.out.println("Enter the total number of floors in the building");
		int floorCount = sc.nextInt();

		for (int i = 0; i < floorCount; i++) {
			System.out.println("Enter the floor size given on day : " + (i + 1));
			floors.add(sc.nextInt());
		}

		// retrieving day-wise building floor assemble order
		skyscraper.AssembleFloor(floors);

		// closing scanner
		sc.close();
	}

}

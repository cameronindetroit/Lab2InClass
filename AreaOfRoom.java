package co.grandcircus.demos;

import java.util.Scanner;

public class AreaOfRoom {

	public static void main(String[] args) {
		// scanner for program to receive inputs
		Scanner scnr = new Scanner(System.in);

		// Variables for Program
		double lengthInInches;
		double widthInInches;
		double heightInINches;
		double areaInInches;
		double perimeterInInches;
		double volumeInInches;
		boolean stop;
		String calculateAnotherRoom;
		char calculateAnotherRoomResult;

		/*
		 * Do while loop to first run the program and then evaluate the expression to
		 * see if user wants to continue
		 */
		do {
			// Prompt user to enter length and width of classroom in decimals(double/float,
			// etc)
			System.out.println("Please type the length of the room ");
			lengthInInches = scnr.nextDouble();

			System.out.println("Please type the width of the room");
			widthInInches = scnr.nextDouble();

			System.out.println("Please type the height of the room");
			heightInINches = scnr.nextDouble();

			// Display area and length of classroom

			System.out.println("The length of the room is " + lengthInInches + " inch");
			System.out.println("The width of the room is " + widthInInches + " inch");
			System.out.println("The height of the room is " + heightInINches + " inch");

			// calculate area of room (area = length * width)
			areaInInches = lengthInInches * widthInInches;
			System.out.println("The area of the room is " + areaInInches + " inch");

			// calculate perimeter of room (p = 2(l + w))
			perimeterInInches = 2 * (lengthInInches + widthInInches);
			System.out.println("The perimeter of the room is " + perimeterInInches + " inch");

			// calculate the volume of a room: Get height of room (v = l * w
			// * h)
			volumeInInches = lengthInInches * widthInInches * heightInINches;
			System.out.println("The volume of the room is " + volumeInInches + " inch");

			// Prompt user to agree to continue program
			System.out.println("would you like to calculate another room? y/n");
			calculateAnotherRoom = scnr.next();
			calculateAnotherRoomResult = calculateAnotherRoom.charAt(0);

			if (calculateAnotherRoomResult == 'y') {
				stop = false;
			} else {
				stop = true;
				// Exit the program
				System.out.println("you have chosen to quit the program");
			}

		} while (stop == false);

	}

}

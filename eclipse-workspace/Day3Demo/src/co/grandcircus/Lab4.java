package co.grandcircus;

import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {

		// prompt the user to enter an integer

		Scanner scnr = new Scanner(System.in);

		int i = 0;
		String yesno = "y";

		while (yesno != "n") {

			System.out.println("Enter an integer");
			i = scnr.nextInt();
			System.out.println("Number " + " Squared" + " Cubed");
			System.out.println("======  ======= =====");
			while (i != 0) {

				// display a table of squares and cubes from 1 to the value entered
				int numB1 = i;
				int squared = numB1 * numB1;
				int cubed = numB1 * numB1 * numB1;
				System.out.print(i);
				System.out.printf("%10d", squared);
				System.out.printf("%10d", cubed);
				System.out.println("");

				--i;
			}
			System.out.println("Continue? (y/n)");
			yesno = scnr.next();
		}
	}
}

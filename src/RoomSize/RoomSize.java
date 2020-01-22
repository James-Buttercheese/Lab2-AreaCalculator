package RoomSize;

import java.util.Scanner;

public class RoomSize {

	/*
	 * @author James McDowell
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scnr = new Scanner(System.in);
		
		double length = 0;
		double width = 0;
		double height = 0;
		double area = 0;
		double perimeter = 0;
		double volume = 0;
		char userInput = 'y';
		
		while (userInput =='y') {
			System.out.println("Enter length:");
			length = scnr.nextDouble();
		
			System.out.println("Enter width:");
			width = scnr.nextDouble();
		
			System.out.println("Enter height");
			height = scnr.nextDouble();
		
		
			area = (length * width);
			perimeter = ((2*length) + (2*width));
			volume = (length * width * height);
			
			System.out.println("The area is " + area);
			System.out.println("The perimeter is " + perimeter);
			System.out.println("The volume is " + volume);
		
			System.out.println("Would you like to try again?  y or n");
			userInput = scnr.next().charAt(0);
		}
		System.out.println("Thank you for using my app, goodbye.");
	}

}

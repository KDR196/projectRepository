//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {
		
		System.out.println("Week 1 Lab");

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight	
		int availablePlaneSeats = 20;

		
		// 2. Create a variable to hold the cost of groceries at checkout
		double costOfGroceries = 75.99; 

		
		// 3. Create a variable to hold a person's middle initial
		char middleInitial = 'D';  

	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		boolean isHotOutside = false;
				

		
		// 5. Create a variable to hold a customer's first name
		String customerFirstName = "Kai";

		
		// 6. Create a variable to hold a street address
		String streetAddress = "8016 Lion St"; 
		

		// 7. Print all variables to the console
		System.out.print("Available seats on the plane " + availablePlaneSeats + "\n");
		System.out.print(costOfGroceries + " is the cost for groceries\n");
		System.out.print("the person's middle initial is " + middleInitial + "\n");
		System.out.print("It hot outside " + isHotOutside + "\n");
		System.out.print("The customer's first name is " + customerFirstName + "\n");
		System.out.print("The person lives at " + streetAddress + "\n");
	

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		availablePlaneSeats = availablePlaneSeats - 2;
		System.out.print(availablePlaneSeats + "\n");
		 
	

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
		costOfGroceries = costOfGroceries + 2.15;
		System.out.print(costOfGroceries + "\n"); 


		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		middleInitial = 'K'; 
		System.out.print(middleInitial + "\n");		
		

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		isHotOutside = true;
		System.out.print(isHotOutside + "\n");


		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		String fullName = customerFirstName + " " + middleInitial + " Rochette";
		System.out.print(fullName + "\n");
	

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
		System.out.print("The customer " + fullName + " " + "lives at" + " " + streetAddress + ".");
		
		

		
		
	}
}
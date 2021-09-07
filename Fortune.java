/*

Ask the user for the user’s first name.

Ask the user for the user’s last name.

Ask the user for the user’s age.

Ask the user for the user’s birth month (as an 'int').

Ask the user for the user’s favorite ROYGBIV color.

If the user does not know what ROYGBIV is, ask the user to enter “Help” to get a list of the ROYGBIV colors.

Ask the user for the user's number of siblings.


*/

import java.util.Scanner;

class Fortune{

	public static void main(String[] args){
		System.out.println("What is your first name?");
		Scanner inputScanner = new Scanner(System.in);
		String firstName = inputScanner.nextLine();
		//System.out.println("Hello, " + firstName);
		System.out.println("What is your last name?");
		String lastName = inputScanner.nextLine();
		
		System.out.println("What is your age?");
		int age = inputScanner.nextInt();
		//System.out.println(firstName + " you are " + age + " years old");
		System.out.println("What is your birth month as a number");
		
		int birthMonth = inputScanner.nextInt();
		System.out.println("What is your favorite Color?");
		inputScanner.nextLine();
		String favColor = inputScanner.nextLine();
		System.out.println("Your favorite color is: " + favColor);
	}

}

/**
 * 
 */
package uk.ac.qub.revision;

import java.util.Scanner;
import java.lang.Math;   //The keyword static lets a method run without any instance of the class. 

/**
 * Looking at practical 3 for revision purposes
 * @author DKieran
 *
 */
public class Practical3Revision {

	/**
	 * Looking at Operators and Selection Statements
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// Prompt user for dp number, assign to a var and output as directed in Aidan's question
		
		//declaring vars / instantiating classes
		Scanner scanner = new Scanner(System.in);
		double userInput;
		
		//prompting user for input and assign to var
		System.out.println("Please enter a number to 2 decimal places, eg 9.99");
		
		//assign input to var
		userInput = scanner.nextDouble();
		
		//output input (1)rounded to 2dp, 
		System.out.printf("%.2f\n", userInput);
		
		//(2) squared to 3dp 
		System.out.printf("%.3f\n", Math.pow(userInput, 2));
		
		//(3) cubed to 3dp 
		System.out.printf("%.3f\n", Math.pow(userInput, 3));
	
		//(4) Square Rooted to 4 dp
		System.out.printf("%.4\n", Math.sqrt(userInput));
		
		//closing resources
		scanner.close();
		
		

	}

}

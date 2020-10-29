/**
 * 
 */
package uk.ac.qub.revision;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;


/**
 * @author DKieran The aim of this class is to practice creating and invoking
 *         methods, as instructed in the questions from Practical 5 Part 1
 */
public class Practical5Part1Revision {

	/**
	 * Invoke and create methods to carry out a variety of methods, as per assignment instructions
	 * @param args
	 */
	public static void main(String[] args) {
		// Part 1 - Method Invocation
		// INVOKE A METHOD THAT ---
			// Determines and prints odd/even for any number
			// Converts upper case to lower case(if not already lower case)
			// Will determine, when two integers are passed in, if the second is a multiple of the first
			// Will generate 10 random numbers between 1 and 100 inclusive, ie "Generated : 82...etc.. Done"
			// Will take in user input of 2 integers(between 5 and 50 - include validation) and output a countdown between the 2 numbers including on the same line the same number of asterisks
			// Prompts user for a number and for digits 1-9 prints the word(one-nine) or if >9 prints 'other'(use a nested if-else first, then a switch)
			// prompts user for upper bound and print sum+average of all numbers below it
			// Uses the calendar class to determine if it's currently am or pm and prints an appropriate message

		// Invoking first 4 methods:
		evenOddChecker(-2);
		lowerCaseConverter("A");
		multipleChecker(2, 4);
		tenRandomNumbersGenerator();

		// Instantiating scanner class
		Scanner scanner = new Scanner(System.in);
		int firstInt, secondInt;

		
		do {
			//Prompt user for input and assign to var
			System.out.println("Enter integer to count down FROM (5-50): ");
			firstInt = scanner.nextInt();
			System.out.println("Enter integer to count down TO (5-50): ");
			secondInt = scanner.nextInt();
			//Print error message if needed
			if (firstInt < 5 || firstInt > 50 || firstInt < secondInt || secondInt < 5 || secondInt > 50) {
				System.out.println("Please enter a valid input(between 5 and 50; first number should be bigger than second.)");
			}
		} while (firstInt < 5 || firstInt > 50 || firstInt < secondInt || secondInt < 5 || secondInt > 50);//validation - repeat loop until expression is untrue

		// Invoke count-down method, passing in user's inputs as parameters
		countdownWithStars(firstInt, secondInt);
		// Invoke number to word converter
		numberToWordConverter();
		// Invoke sum and average method and pass in upper bound
		sumAndAverager(10);
		//Invoke am pm method
		decidesAmOrPm();
		// Closing resources:
		scanner.close();

	}// end of main method

	
	
	/**
	 * Determines odd/even for any number passed in as a parameter and prints outcome
	 * 
	 * @param num
	 */
	public static void evenOddChecker(int num) {
		if (num % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}// end of evenOddChecker method

	
	
	/**
	 * converts upper case to lower case(if not already lower case) and prints outcome
	 * 
	 * @param letter
	 */
	public static void lowerCaseConverter(String letter) {
		if (letter.equals(letter.toLowerCase())) {
			System.out.println("Already lower case");
		} else {
			System.out.println(letter.toLowerCase());
		}
	} // end of lowerCaseConverter method

	
	
	/**
	 * determines and prints, when two integers are passed in, if the second is a
	 * multiple of the first
	 * 
	 * @param firstNum
	 * @param secondNum
	 */

	public static void multipleChecker(int firstNum, int secondNum) {
		if (secondNum % firstNum == 0) {
			System.out.println(secondNum + " is a multiple of " + firstNum);
		} else {
			System.out.println(secondNum + " is not a multiple of " + firstNum);

		} // end of multipleChecker method
	}

	
	
	/**
	 * //will generate and print 10 random numbers between 1 and 100 inclusive, ie
	 * "Generated : 82...etc.. Done"
	 */
	public static void tenRandomNumbersGenerator() {
		// instantiating class and declaring vars
		Random random = new Random();
		// repeat the loop 10 times
		for (int loop = 0; loop < 10; loop++) {
			int counter;
			// generate a new random number for every iteration of loop
			counter = random.nextInt(100);
			System.out.println(counter);
		}
	}// end of tenRandomNumberGenerator method

	
	
	/**
	 * Will take in user input of 2 integers and output a countdown between the 2
	 * numbers including on the same line the same number of asterisks
	 * @param startPoint
	 * @param endPoint
	 */
	public static void countdownWithStars(int startPoint, int endPoint) {
		for (int outerLoop = startPoint; outerLoop >= endPoint; outerLoop--) {
			System.out.print(outerLoop);
			//For every pass of outerloop, take its value and print that many *s on the same line
			for (int innerLoop = 1;innerLoop<=outerLoop;innerLoop++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}// end of countdownWithStars method
	
	
	/**
	 * Prompts user for a number and for digits 1-9 return the word(one-nine) or if >9 print 'other'(use a nested if-else first, then a switch)
	 */
	public static void numberToWordConverter() {
		//Declaring vars and instantiating scanner class
		Scanner scanner = new Scanner(System.in);
		int numToBeChanged;
		
		//Prompting and assigning user input
		System.out.println("Please enter a number (1-9 inclusive)");
		numToBeChanged = scanner.nextInt();
		
		//First using if-else statements to convert
		if(numToBeChanged > 9 || numToBeChanged < 1) {
			System.out.println("Other");
		}else if (numToBeChanged == 1) {
			System.out.println(numToBeChanged + ": One");			
		}else if (numToBeChanged == 2) {
			System.out.println(numToBeChanged + ": Two");			
		}else if (numToBeChanged == 3) {
			System.out.println(numToBeChanged + ": Three");			
		}else if (numToBeChanged == 4) {
			System.out.println(numToBeChanged + ": Four");			
		}else if (numToBeChanged == 5) {
			System.out.println(numToBeChanged + ": Five");			
		}else if (numToBeChanged == 6) {
			System.out.println(numToBeChanged + ": Six");			
		}else if (numToBeChanged == 7) {
			System.out.println(numToBeChanged + ": Seven");			
		}else if (numToBeChanged == 8) {
			System.out.println(numToBeChanged + ": Eight");			
		}else if (numToBeChanged == 9) {
			System.out.println(numToBeChanged + ": Nine");			
		}
		
		//Secondly using a switch statement to accomplish same affect
		switch (numToBeChanged) {
		case 1:
			System.out.println(numToBeChanged + ": One");
			break;
		case 2:
			System.out.println(numToBeChanged + ": Two");
			break;
		case 3:
			System.out.println(numToBeChanged + ": Three");
			break;
		case 4:
			System.out.println(numToBeChanged + ": Four");
			break;
		case 5:
			System.out.println(numToBeChanged + ": Five");
			break;
		case 6:
			System.out.println(numToBeChanged + ": Six");
			break;
		case 7:
			System.out.println(numToBeChanged + ": Seven");
			break;
		case 8:
			System.out.println(numToBeChanged + ": Eight");
			break;
		case 9:
			System.out.println(numToBeChanged + ": Nine");
			break;
		default:
			System.out.println("Other");
		}
		
		// Closing resources:
		scanner.close();
	}//end of numberToWordConverter
	
	
	/**
	 * Prompts user for upper bound and print sum+average of all numbers below it
	 * @param upperBound
	 */
	// Accepts parameter as upper bound and prints sum + average of all positive integers that are less then upper bound
	public static void sumAndAverager (int upperBound){
		//Declaring var
		int sum;
		//Initialising
		sum = 0;
		//Iterating through all integers less than upperbound and keeping a running total
		for (int loop = 0; loop<= upperBound; loop++) {
			sum+= loop;
		}
		//Printing sum and average
		System.out.println("Total of numbers up to " + upperBound + " = " + sum);
		System.out.println("Average of numbers up to " + upperBound + " = " + ((double) sum / upperBound));
	}//end of sumAndAverager method
	
	
	// Uses the calendar class to determine if it's currently am or pm and prints an appropriate message
	public static void decidesAmOrPm() {
		//Instantiating class and declaring vars
		Calendar cal = Calendar.getInstance();
		//One way to do it:
		if (cal.after(cal.PM)){
			System.out.println("It's AM");
		}else {
			System.out.println("It's PM");
		}
		
		//alternative way to do it:
		if (cal.get(cal.HOUR_OF_DAY) < 12) {
			System.out.println("It's AM");
		} else {
			System.out.println("It's PM ");
		}
	}//end of decidesAmOrPmMethod

}// end of class
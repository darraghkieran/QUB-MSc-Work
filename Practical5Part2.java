/**
 * 
 */
package uk.ac.qub.revision;

import java.util.Random;
import java.util.Scanner;

/**
 * @author DKieran The aim of this class is to practice creating and invoking
 *         methods, as instructed in the questions from Practical 5 Part 2
 *
 */
public class Practical5Part2 {

	/**
	 * Invoke and create methods to carry out a variety of methods, as per
	 * assignment instructions
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Create and invoke separate methods to do the following: 
		 * 1 Return the area of a rectangle, given the height and base
		 * 2 Takes an integer 1-12 and return the appropriate month
		 * 3 Takes 3 ints and returns average as a double 
		 * 4 Takes name of a G8 country and returns capital city 
		 * 5 Takes user choice of heads/tails, simulates tossing a coin and outputs result.
		 * 
		 */

		// invoke method and assign its return value to a var then format print it
		double area = rectangleAreaCalculator(3.4, 2.3);
		System.out.printf("%.2f\n", area);

		// invoke method and print it's return value
		System.out.println(monthDistinguisher(12));

		// invoke average method and print value
		double calculatedAverage = averageCalculator(3, 2, 333);
		System.out.printf("%.3f\n", calculatedAverage);

		// declare var and assign a value to it
		String g8Country;
		g8Country = "UnItEd StAtEs";
		// invoke capitalizer method and output return, handling lower/upper case
		// variation
		System.out.println(capitalizer(g8Country.toUpperCase()));

		// Prompt user for heads or tails
		// declare var and instantiate class
		String headsOrTails;
		Scanner scanner = new Scanner(System.in);
		// prompt for input
		System.out.println("Heads or tails?");
		// assign input to var
		headsOrTails = scanner.nextLine();
		// invoke method, passing in user's choice
		coinFlipper(headsOrTails);

	}

	/**
	 * Return the area of a rectangle, given the height and base
	 * 
	 * @param width
	 * @param length
	 * @return
	 */
	public static double rectangleAreaCalculator(double width, double length) {
		// calculate area and return result
		return (width * length);
	}// end of rectangleAreaCalculator method

	/**
	 * Takes an integer 1-12 and return the appropriate month
	 * 
	 * @param userMonth
	 * @return
	 */
	public static String monthDistinguisher(int userMonth) {
		// declare int
		String monthWord;
		// switch on user input and assign appropriate String
		switch (userMonth) {
		case 1:
			monthWord = "January";
			break;
		case 2:
			monthWord = "Febuary";
			break;
		case 3:
			monthWord = "March";
			break;
		case 4:
			monthWord = "April";
			break;
		case 5:
			monthWord = "May";
			break;
		case 6:
			monthWord = "June";
			break;
		case 7:
			monthWord = "July";
			break;
		case 8:
			monthWord = "August";
			break;
		case 9:
			monthWord = "September";
			break;
		case 10:
			monthWord = "October";
			break;
		case 11:
			monthWord = "November";
			break;
		case 12:
			monthWord = "December";
			break;
		default:
			monthWord = "Invalid Month number entered";
		}
		// return month as String
		return monthWord;
	}

	/**
	 * Takes 3 ints and returns average as a double
	 * 
	 * @param firstVal
	 * @param secondVal
	 * @param thirdVal
	 * @return
	 */
	public static double averageCalculator(int firstVal, int secondVal, int thirdVal) {
		double average = (double) ((firstVal + secondVal + thirdVal) / 3);
		return average;
	}

	/**
	 * Takes name of a G8 country and returns capital city of that country
	 * 
	 * @param countryName
	 * @return
	 */
	public static String capitalizer(String countryName) {
		// declare var
		String capitalCity;
		// switch on countryName
		switch (countryName.toUpperCase()) {
		case "CANADA":
			capitalCity = "Ottawa";
			break;
		case "FRANCE":
			capitalCity = "Paris";
			break;
		case "GERMANY":
			capitalCity = "Berlin";
			break;
		case "ITALY":
			capitalCity = "Rome";
			break;
		case "JAPAN":
			capitalCity = "Tokyo";
			break;
		case "RUSSIA":
			capitalCity = "Moscow";
			break;
		case "United Kingdom":
		case "UK":
		case "U.K.":
			capitalCity = "London";
			break;
		case "UNITED STATES":
		case "US":
		case "U.S.":
		case "UNITED STATES OF AMERICA":
		case "AMERICA":
			capitalCity = "Washington D.C.";
			break;
		default:
			capitalCity = "Invalid G8 country";
		}
		return capitalCity;
	}

	
	/**
	 * Takes user choice of heads/tails, simulates tossing a coin and outputs result.
	 * @param userChoice - heads or tails
	 */
	public static void coinFlipper(String userChoice) {
		// declaring vars and instantiating classes
		int flipResult;

		Random random = new Random();

		// output message to user
		System.out.println("User choice is: " + userChoice + "\nLet's flip!");

		// use object of the random class to pseudo-randomly output the result of a coin
		// fli
		flipResult = random.nextInt(2);
		// output message for either result
		// if they guess heads and it is heads
		if (flipResult == 0 && userChoice.equalsIgnoreCase("heads")) {
			System.out.println("Heads - You just got lucky!");
			// if they guess heads and it isn't heads
		} else if ((flipResult == 1 && userChoice.equalsIgnoreCase("heads"))) {
			System.out.println("Tails - Better luck next time bub");
			// if they guess tails and it is tails
		} else if ((flipResult == 1 && userChoice.equalsIgnoreCase("tails"))) {
			System.out.println("Tails -Look at you go! Tails never fails :-D");
			// if they guess tails and it isn't tails
		} else if ((flipResult == 0 && userChoice.equalsIgnoreCase("tails"))) {
			System.out.println("Heads - This is why you shouldn't gamble!");
		} else {
			System.out.println(
					"Much like a story, there's TWO sides to every coin... Please enter valid input(heads or tails)");
		}
	}

}

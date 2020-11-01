/**
 * 
 */
package uk.ac.qub.revision;

import java.util.Scanner;

/**
 * This class is for revision purposes and will look at the MSc Practical 6
 * assignments, focused around arrays
 * 
 * @author DKieran
 *
 */

public class Practical6Part1Revision {

	private static final double RATE = 11.50;

	/**
	 * focusing on arrays as per assignment instructions from practical 6
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		incDecrementer();

		int hoursWorked[] = { 8, 7, 9, 7, 4, 5 };
		String workingDays[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		wageCalculator(hoursWorked, workingDays);

		tempCalculator();

		double heights[] = { 1.4, 1.9, 1.31, 1.2 };
		heightsCalculator(heights);

		nameChecker();

		evenNumbersTo100();

		int anArray[] = { 3, 4, 5, 2, 34, 23 };
		printsInts(anArray);

		assignmentChecker();

		sentenceHolder();

	}

	/**
	 * Initialise an array and print all values when incrementing through elements,
	 * then decrementing through elements
	 */
	public static void incDecrementer() {
		// initialise array
		int myArray[] = { 2, 3, 8, 11, 14 };
		// initialise loop to 0 and increment it until it to length of array is reached
		for (int loop = 0; loop < myArray.length; loop++) {
			System.out.print(myArray[loop]);
			// don't print comma for last element
			if (myArray[loop] != myArray[myArray.length - 1]) {
				System.out.print(", ");
			}
		}
		System.out.println();
		// initialise dloop to one less than the length of the array(which is the last
		// element) and decrement it until it reaches 0.
		for (int dloop = myArray.length - 1; dloop >= 0; dloop--) {
			System.out.print(myArray[dloop]);
			// don't print comma for last element
			if (myArray[dloop] != myArray[myArray.length - 1]) {
				System.out.print(", ");
			}
		}

		System.out.println();
	}

	/**
	 * Write a program for a person who has worked 8, 7, 9, 7, 4 hours in a 5 day
	 * week at £10.25 per house. Output hours in day/week and final weekly salary
	 */
	public static void wageCalculator(int[] hours, String[] workDays) {
		// declare var
		double wage = 0;
		// iterate through both arrays and output all values in each
		for (int loop = 0; loop < hours.length; loop++) {
			System.out.println("Hours worked on " + workDays[loop] + ": " + hours[loop]);
			// calculate total pay for hours worked at hourly rate
			wage += hours[loop] * RATE;
		}
		System.out.printf("Final Weekly Salary is: %.2f\n", wage);

	}

	/**
	 * //Store the following temperatures and output average temp: 3.4, 4.2, 9.0,
	 * 2.2, 4.5, 6.4, 3.1
	 */
	public static void tempCalculator() {
		// create array and vars
		double tempsCel[] = { 3.4, 4.2, 9.0, 2.2, 4.5, 6.4, 3.1 };
		double total, hottest, coldest;
		total = 0;
		hottest = tempsCel[0];
		coldest = tempsCel[0];

		for (int loop = 0; loop < tempsCel.length; loop++) {
			total += tempsCel[loop];

			if (tempsCel[loop] > hottest) {// if current value bigger than hottest, make it the hottest
				hottest = tempsCel[loop];
			}
			if (tempsCel[loop] < coldest) {
				coldest = tempsCel[loop]; // if current value smaller than the coldest, make it the coldest
			}
		}
		// initialise vars
		System.out.printf("Average temp: %.2f\n", (total / tempsCel.length));
		System.out.println("Coldest Temp: " + coldest);
		System.out.println("Hottest Temp: " + hottest);

	}

	/**
	 * Store 4 heights and calculate average height, tallest height and smallest
	 * height
	 * 
	 * @param firstHt
	 * @param secondHt
	 * @param thirdHt
	 * @param fourthHt
	 */
	public static void heightsCalculator(double[] hts) {
		double average, total, smallest, biggest;
		total = 0.0;
		smallest = hts[0];
		biggest = hts[0];

		for (int loop = 0; loop < hts.length; loop++) {
			total += hts[loop];

			if (hts[loop] < smallest) {
				smallest = hts[loop];
			}
			if (hts[loop] > biggest) {
				biggest = hts[loop];
			}
		}
		average = (total / hts.length);
		System.out.printf("Average height is: %.2f\n", average);
		System.out.println("Smallest Height: " + smallest);
		System.out.println("Biggest Height: " + biggest);

	}

	/**
	 * 
	 * Prompt user for name, store as string, loop through and count occurrences of
	 * different vowels(case insensitive). Output total occurrences of each vowel
	 * 
	 * @param name
	 */
	public static void nameChecker() {
		// instantiate class and declare/initialise vars
		Scanner scanner = new Scanner(System.in);
		String userName;
		int totalAs, totalEs, totalIs, totalOs, totalUs;
		totalAs = 0;
		totalEs = 0;
		totalIs = 0;
		totalOs = 0;
		totalUs = 0;

		// prompt user for name and store in var
		System.out.println("Please type your name...");
		userName = scanner.nextLine();

		// loop through string
		for (int loop = 0; loop < userName.length(); loop++) {
			// switch on the specific char of the String on every pass of the loop
			switch (userName.charAt(loop)) {
			case 'a':
			case 'A':
				totalAs++;
				break;
			case 'e':
			case 'E':
				totalEs++;
				break;
			case 'i':
			case 'I':
				totalIs++;
				break;
			case 'o':
			case 'O':
				totalOs++;
				break;
			case 'u':
			case 'U':
				totalUs++;
				break;
			}
		}
		// output
		System.out.println(userName + " contains " + totalAs + "'A's");
		System.out.println(userName + " contains " + totalEs + "'E's");
		System.out.println(userName + " contains " + totalIs + "'I's");
		System.out.println(userName + " contains " + totalOs + "'O's");
		System.out.println(userName + " contains " + totalUs + "'U's");

		// closing resources
		scanner.close();
	}

	/**
	 * Create an array, populate with all even numbers from 1-100, then output
	 * contents and total
	 */
	public static void evenNumbersTo100() {
		// declare var
		int endPoint;
		// initialise var
		endPoint = 100;
		// create array big enough to hold values up to endPoint
		int[] evenNumbers = new int[endPoint + 1];
		// iterate all values up to endPoint
		for (int loop = 1; loop <= endPoint; loop++) {
			// if value is even, assign to an array element and output that element
			if (loop % 2 == 0) {
				evenNumbers[loop] = loop;
				System.out.println(evenNumbers[loop]);
			}
		}
	}

	/**
	 * Output the contents of an array of ints (of any size) to screen.
	 */
	public static void printsInts(int intsArray[]) {

		for (int loop = 0; loop < intsArray.length; loop++) {
			System.out.println(intsArray[loop]);
		}
	}

	/**
	 * Create 2 arrays that will hold the following marks: Assignment1(23, 42,29.66,
	 * 77); Assignment 2:(79, 68, 31, 22, 42). Output the average of each assignment
	 * to 1d.p., the overall average mark of both assignments and the best mark
	 * achieved across both.
	 */
	public static void assignmentChecker() {
		// initialising arrays
		double a1[] = { 23, 42, 29, 100, 77 };
		double a2[] = { 79, 68, 31, 99, 42 };
		// declaring vars
		double a1Total = 0.0;
		double a2Total = 0.0;
		double bestOfA1 = a1[0];
		double bestOfA2 = a2[0];

		// total of a1 scores
		for (int loop = 0; loop < a1.length; loop++) {
			a1Total += a1[loop];
			// best mark from this assignment
			if (a1[loop] > bestOfA1) {
				bestOfA1 = a1[loop];
			}
		}

		// total of a2 scores
		for (int looper = 0; looper < a2.length; looper++) {
			a2Total += a2[looper];
			// best mark from this assignment
			if (a2[looper] > bestOfA2) {
				bestOfA2 = a2[looper];
			}
		}
		// output average of each assignment
		System.out.printf("Average of Assignment 1: %.1fpercent\n", (a1Total / a1.length));
		System.out.printf("Average of Assignment 2: %.1fpercent\n", (a2Total / a2.length));
		// output average mark of both assignments
		System.out.println("Overall Average: " + (a1Total + a2Total) / (a1.length + a2.length));
		// use conditional logic to decide best mark across both assignments
		if (bestOfA1 == bestOfA2) {
			System.out.println("Highest overall grade: " + bestOfA1 + ": (Scored in both assignments)");
		} else if (bestOfA1 > bestOfA2) {
			System.out.println("Highest overall grade: " + bestOfA1 + ": Scored in Assignment 1");
		} else if (bestOfA2 > bestOfA1) {
			System.out.println("Highest overall grade: " + bestOfA2 + ": Scored in Assignment 2");
		}
	}

	/**
	 * Create a String array to hold the following quote .. (Each word should be
	 * stored as an element in the array.) "Continuous effort not strength nor
	 * intelligence is the key for unlocking our potential". Output: The full quote.
	 * The number of words The number of letters The smallest word(s) The largest
	 * word(s)
	 */
	public static void sentenceHolder() {
		// initialising array
		String sentanceArray[] = { "Continuous", "effort", "not", "strength", "nor", "intelligence", "is", "the", "key",
				"for", "unlocking", "our", "potential" };
		// declaring vars
		int numberOfWords, numberOfLetters;
		String shortestWord, longestWord;
		// initialising vars
		numberOfWords = 0;
		numberOfLetters = 0;
		shortestWord = sentanceArray[0];
		longestWord = sentanceArray[0];

		// iterate through sentence
		for (int loop = 0; loop < sentanceArray.length; loop++) {
			// output full quote
			System.out.print(sentanceArray[loop] + " ");
			// calculate number of words
			numberOfWords++;
			// calc numberOfLetters
			numberOfLetters += sentanceArray[loop].length();
			// calc smallest
			if (sentanceArray[loop].length() < shortestWord.length()) {
				shortestWord = sentanceArray[loop];
			}
			if (sentanceArray[loop].length() > longestWord.length()) {
				longestWord = sentanceArray[loop];
			}
		}

		// output total of words
		System.out.println("\nTotal words: " + numberOfWords);
		System.out.println("Total Letters: " + numberOfLetters);
		System.out.println("Smallest word: " + shortestWord);
		System.out.println("Largest word: " + longestWord);

	}

}

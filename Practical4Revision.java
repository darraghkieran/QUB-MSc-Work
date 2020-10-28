/**
 * 
 */
package uk.ac.qub.revision;

import java.util.Scanner;

/**
 * Revising loops with MSc practical 4
 * 
 * @author DKieran
 *
 */
public class Practical4Revision {

	/**
	 * Revising loops with MSc practical 4
	 * 
	 * @param args
	 */
	
	static int age; // global var
	
	public static void main(String[] args) {

		// PART 1
		// Declaring and initialising vars
		int sum, num;
		num = 1;
		sum = 0;
		// add together, assign to sum and output
		sum += num;
		// output sum
		System.out.println(sum);

		// create a while statement that calculates and prints sum of all integers 1-10.
		while (sum < 10) {
			sum++;
			System.out.println(sum);
		}

		
		
		
		
		
		
		// PART 2 // use a do while statement to give user menu options, prompt user
		// for an input and give appropriate response to their input

		// declaring vars / instantiating class
		int userChoice;

		Scanner scanner = new Scanner(System.in);
		System.out.println("1) File\n2) Edit\n3) Save\n4) Delete\n5) Exit");

		do { // prompt user for choice and assign to var
			System.out.println("Select Option 1-5");
			userChoice = scanner.nextInt();
			// output appropriate msg based on input
			switch (userChoice) {
			case 1:
				System.out.println("File Selected");
				break;
			case 2:
				System.out.println("Edit Selected");
				break;
			case 3:
				System.out.println("Save Selected");
				break;
			case 4:
				System.out.println("Delete Selected");
				break;
			case 5:
				System.out.println("Exiting Program");
				break;
			default:
				System.out.println("Please enter valid input");

			}

		} while (userChoice != 5);

		System.out.println("Goodbye");
		
		
		
		
		
		// PART 3
		// prompt user for name and print it as a String 10 times
		String name;
		System.out.println("What's your name?");
		name = scanner.nextLine();
		for (int loop = 0; loop < 10; loop++) {
			System.out.println(name);
		}
		
		// use a while loop to create a countdown to blast off
		int countdown;
		countdown = 10;
		while (countdown > 0) {
			System.out.print(countdown + ",");
			countdown--;
		}
		System.out.println(" Blast Off!!");

		// output even numbers between 1-100
		for (int evenNum = 1; evenNum <= 100; evenNum++) {
			if (evenNum % 2 == 0) {
				System.out.println(evenNum);
			}
		}

		// output odd numbers between 10-40
		for (int oddNum = 10; oddNum <= 40; oddNum++) {
			if (oddNum != 40) {
				System.out.println(oddNum);
			}
		}

		// countdown from 1000 - 0 but abort at 0 with a break statement
		for (int number = 1000; number > 0; number--) {
			System.out.println(number);
			if (number == 333) {
				break;
			}
		}
		System.out.println("Launch aborted");

		// Part3(b) Create a program that outputs:
		// *1, *2, *3, *4, *5, *6, *7, *8, *9, *10
		// **1, **2, **3, **4, **5, **6, **7, **8, **9, **10
		// ***1, ***2,***3,***4,***5,***6,***7,***8,* **9,***10

		// OPTION 1 - Seperate FOR loops:
		for (int firstLine = 0; firstLine <= 10; firstLine++) {
			System.out.print("*" + firstLine);
			if (firstLine != 10) {
				System.out.print(", ");
			}
		}
		System.out.println();
		for (int secondLine = 1; secondLine <= 10; secondLine++) {
			System.out.print("**" + secondLine);
			if (secondLine != 10) {
				System.out.print(", ");
			}
		}
		System.out.println();

		for (int thirdLine = 1; thirdLine <= 10; thirdLine++) {
			System.out.print("***" + thirdLine);
			if (thirdLine != 10) {
				System.out.print(", ");
			}
		}
		System.out.println();

		// OPTION 2 - Nested FOR Loops:
		for (int outerLoop = 1; outerLoop <= 3; outerLoop++) {
			for (int innerLoop = 1; innerLoop <= 10; innerLoop++) {
				// print 1-10 for each pass of outer loop
				System.out.print(innerLoop);
				// handle instances of 10
				if (innerLoop != 10) {
					System.out.print(", ");
					// for all other numbers print an additional * for each successive row
					if (outerLoop == 1) {
						System.out.print("*");
					} else if (outerLoop == 2) {
						System.out.print("**");
					} else {
						System.out.print("***");
					}
				}
			} // end of inner loop
			System.out.println();// new line between each row
		} // end of outer loop

		
		
		
		
		// Part 3(c) Output leap years between 1850 and 1990
		for (int year = 1850; year < 1990; year++) {
			if (year % 4 == 0 && year % 100 != 0) {
				System.out.println(year);
			}
		}
		
		
		
		
		//Part 3(d) Prompt user for age between 0 and 120, output an appropriate message and re-prompt if given number is out of range
		do {
			System.out.println("How old are you?");
			age = scanner.nextInt();
			
			if (age > 0 && age <= 30) {
				System.out.println("Young pup you are!");
			} else if (age > 30 && age <= 60) {
				System.out.println("Getting on a wee bit!");
			} else if(age>60 && age <=120){
				System.out.println("Great things come with age!");
			}else {
				System.out.println("Impossible! Now let's try that again...");
			}
		}while(age > 120 || age < 0);

		
		// closing resources 
		scanner.close();
	}

}

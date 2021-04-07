package errorhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TCWithResources {

	/**
	 * main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			readFromFile();
		} catch (UserException e) {
			System.out.println(e.getMessage());
//				e.printStackTrace();
		}

	}

	/**
	 * prompts user for input and processes it
	 * 
	 * @throws UserException
	 */
	public static void readFromFile() throws UserException {
		for(int loop =1; loop < 10; loop++) {
			try (Scanner sc = new Scanner(System.in);) {
				int userNumber, answer;
				System.out.println("Enter a number");
				userNumber = sc.nextInt();
				answer = 66 / userNumber;
				System.out.println("answer:" + answer);

			} catch (InputMismatchException | ArithmeticException ex) {
				throw new UserException("Sorry had a problem");
			}
		}
		
	}
}

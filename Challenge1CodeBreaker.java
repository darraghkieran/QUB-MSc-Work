/**
 * 
 */
package revisingchallenges;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author DKieran
 *
 */
public class Challenge1CodeBreaker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Will code a number of characters (String) to ASCII and also has ability to
		 * decode an ascii numeric value * @see http://www.asciitable.com/ *
		 * 
		 * @param args
		 */
		String name;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name: ");
		name = scanner.nextLine();

		int codedString[] = coder(name);
		System.out.println("Coded: " + Arrays.toString(codedString));

		System.out.println("Decoded: " + Arrays.toString(deCoder(codedString)));

		scanner.close();
	}

	/**
	 * Codes a string array char by char into ACSII numeric value
	 * @param input
	 * @return asciiValues[]
	 */
	public static int[] coder(String input) {
		int asciiValues[] = new int[input.length()];
		for (int loop = 0; loop < input.length(); loop++) {
			asciiValues[loop] = input.charAt(loop);
		}
		return asciiValues;

	}

	/**
	 * Decodes an ACSII based array to a readable char array
	 * 
	 * @param asciiString
	 * @return
	 */
	public static char[] deCoder(int asciiString[]) {
		char deCodedName[] = new char[asciiString.length];
		for (int looper = 0; looper < asciiString.length; looper++) {
			deCodedName[looper] = (char) asciiString[looper];
		}

		return deCodedName;

	}

}

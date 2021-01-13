/**
 * 
 */
package revisingchallenges;

/**
 * @author DKieran
 *
 */
public class Challenge2FizzBuzz {

	/**
	 * Write a program that prints the numbers from 1 to 100 and for multiples of
	 * '3' print "Fizz" instead of the number and for the multiples of '5' print
	 * "Buzz", for multiples of 3 and 5 write Fizz Buzz. 1, 2, Fizz, 4, Buzz, Fizz,
	 * 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz, 16, 17, Fizz, 19, Buzz, Fizz,
	 * 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, Fizz Buzz, 31, 32, Fizz, 34, Buzz,
	 * Fizz, ...
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		for (int loop = 1; loop <= 100; loop++) {
			if (loop % 3 == 0) {
				System.out.println("fizz");
			} else if (loop % 5 == 0) {
				System.out.println("buzz");
			} else {
				System.out.println(loop);
			}
		}
		
		
		
	}

}

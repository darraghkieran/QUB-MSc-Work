/**
 * 
 */
package recursivestuffrecursivestuff;

/**
 * @author DKieran
 *
 */
public class Factorial {

	public static void main(String[] args) {
		System.out.println("Fact 5 " + fact(5));
	}

	public static int fact(int num) {
		if (num == 1) {
			return 1; // base case
		} else {
			return num * (fact(--num)); // 1st plate 5x4, 2nd 4*3, then 3*2, then 2*1, then 1(base case)
		}
	}

}

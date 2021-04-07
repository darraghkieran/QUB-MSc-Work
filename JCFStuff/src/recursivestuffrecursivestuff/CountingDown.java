package recursivestuffrecursivestuff;

public class CountingDown {

	public static void main(String[] args) {
		countDown(3);
	}

	public static void countDown(int num) {
		// base case?
		if (num <= 0) {
			System.out.println("End");// once it ends, the called copies peel off the stack 1 by 1, starting with
										// countdown0, then 1, 2, and 3 before control goes back to main
		} else {
			countDown(--num);// messes up output bc the recursive calls are happening before the output, so
								// gets to End first, then on the way down(because countDown remains on the
								// stack waiting to do something) it calls countdown with a 1, then a 2, then a
								// 3(ie peeling off from the top so effectively the reverse to how they were
								// added)
			
			System.out.println(num);
			// countDown(--num);// calls a new copy with the number 2(due to predecrement),
			// ie adds another
			// method to the stack
		}
	}
}

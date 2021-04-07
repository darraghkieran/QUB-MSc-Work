package summingSet;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class was takes an array of numbers and calculates which combinations of those numbers, if any, equal a given total.
 * Commissioned by a local business owner whose suppliers frequently batch order payments, often without accompanying invoice numbers.
 * @author DKieran
 *
 */
public class sumOfSet {

	public static void main(String args[]) {
		Double[] numbers = { 5.62, 2.85, 10.91, 18.42, 10.23, 16.20, 15.15, 1.65, 2.88, 10.10, 5.21, 7.12, 5.12, 2.40,
				2.60 };
		double target = 33.89;
		sum_up(new ArrayList<Double>(Arrays.asList(numbers)), target);
	}

	/**
	 * 
	 * @param numbers
	 * @param target
	 * @param partial
	 */
	public static void sum_up_recursive(ArrayList<Double> numbers, double target, ArrayList<Double> partial) {
		double s = 0;
		for (Double x : partial)
			s += x;
		if (s == target)
			System.out.println("sum(" + Arrays.toString(partial.toArray()) + ")=" + target);
		if (s >= target)
			return;
		for (int i = 0; i < numbers.size(); i++) {
			ArrayList<Double> remaining = new ArrayList<Double>();
			Double n = numbers.get(i);
			for (int j = i + 1; j < numbers.size(); j++)
				remaining.add(numbers.get(j));
			ArrayList<Double> partial_rec = new ArrayList<Double>(partial);
			partial_rec.add(n);
			sum_up_recursive(remaining, target, partial_rec);
		}
	}

	/**
	 * 
	 * @param numbers
	 * @param target
	 */
	public static void sum_up(ArrayList<Double> numbers, double target) {
		sum_up_recursive(numbers, target, new ArrayList<Double>());
	}

}

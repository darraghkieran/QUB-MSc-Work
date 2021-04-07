package collectionxamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency {
	public static void main(String[] args) {
        // create the list of numbers
        Integer[] nums = { 3, 4, 5, 6, 3, 4, 8, 9 };
        List<Integer> numbers = Arrays.asList(nums);
        
        // how many 4s? - old school !
        int total4s=0;
        
        for (Integer i : numbers) {
            if (i==4) {
                total4s++;
            }
        }
        System.out.println("Total number of 4s "+total4s);
        
        
        System.out.println(numbers);
        System.out.printf("The number 4 appears %d times in the list",
                Collections.frequency(numbers, 4));
        
        
        System.out.println(Collections.max(numbers));
    }
}

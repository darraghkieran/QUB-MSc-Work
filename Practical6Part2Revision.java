/**
 * 
 */
package uk.ac.qub.revision;

/**
 * This class will look at Part 2 of Practical 6 - 2D arrays
 * 
 * @author DKieran
 *
 */
public class Practical6Part2Revision {

	/**
	 * Complete assignments from Practical 6 Part 2 - 2D arrays
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		final int ARRAY_SIZE = 4;
		//declare and initialise array
		int myArray[] = new int[ARRAY_SIZE];
		//loop through and populate array
		for (int counter = 0; counter < ARRAY_SIZE; counter++) {
			myArray[counter] = counter * 2 + 2;
		}//output elements
		for (int counter = 0; counter < ARRAY_SIZE; counter++) {
			System.out.print(myArray[counter]);
		}
		//declare and initialise 2d array
		int[][] my2dArray = new int[4][4];
		int number = 1;
		//loop through rows
		for (int rowCounter = 0; rowCounter < my2dArray.length; rowCounter++) {
			//loop through coloumns
			for (int colCounter = 0; colCounter < my2dArray[rowCounter].length; colCounter++) {
				my2dArray[rowCounter][colCounter] = number;//populate with number var
				number += 2;//update number var on each pass
			}
		}
		//output value of each element in 2d array
		for (int rowCounter = 0; rowCounter < my2dArray.length; rowCounter++) {
			for (int colCounter = 0; colCounter < my2dArray[rowCounter].length; colCounter++) {
				System.out.printf("[%d %d] :\t%d\n", rowCounter, colCounter, my2dArray[rowCounter][colCounter]);
			}
			System.out.println();
		}
	}

}

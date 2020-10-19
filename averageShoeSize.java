/**
 * 
 */
package methods;

/**
 * @author DKieran
 *
 */
public class averageShoeSize {

	/**
	 * Create a method that will return the average of shoe size of these students: the shoe sizes should be passed as parameters to the method
	 * a=2, b=4, c=6, d=3, e=12, f=8, g=10
	 * @param args
	 */
	public static void main(String[] args) {
		//call method, assign to var and output return
		double average = calculatingAverages(7, 2, 4, 6, 3, 12, 8, 10);
		System.out.println(average);
		

	}

	/**
	 * @param amountOfStudents
	 * @param studentA
	 * @param studentB
	 * @param studentC
	 * @param studentD
	 * @param studentE
	 * @param studentF
	 * @return the average shoe size of the students as a floating point number
	 */
	public static double calculatingAverages (int amountOfStudents, int studentA, int studentB, int studentC, int studentD, int studentE, int studentF, int studentG) {
		//declare var
		double averageShoeSize;
		//calculate average of parameters 
		averageShoeSize = (studentA + studentB + studentC + studentD + studentE + studentF + studentG) / amountOfStudents;
		//return average of parameters
		return averageShoeSize;
	}
}

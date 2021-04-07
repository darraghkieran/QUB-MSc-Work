/**
 * 
 */
package math.example;

/**
 * @author DKieran
 *
 */
public class NumberCruncher {

	public int addNumbers(int num1, int num2) {
		return num1 + num2;
	}

	public int addNumbers(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

	public int  multiplyNumbers (int num1, int num2, int num3) {
		return num1*num2*num3;
	}
	
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 * @throws Exception if second parameter is zero
	 */
	public double divideNumbers(double num1, double num2) throws Exception {
		double answer;
				//exception checked handle:
		if (num2 ==0) {
			throw new Exception("Invalid divide by zero");
		}
		answer = num1/num2;
		return answer;
	}
	
	
}

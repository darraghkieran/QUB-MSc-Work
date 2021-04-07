/**
 * 
 */
package math.example;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import math.example.NumberCruncher;

/**
 * @author DKieran
 *
 */
class NumberCruncherTest {
	
	//test data - data that can be reused within test cases(ie methods) goes here
	int num1, num2, num3;
	NumberCruncher numberCruncher;//define class here
	

	//data initialised here - set fresh every time
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		num1=2;
		num2=3;
		num3 = 4;
		numberCruncher = new NumberCruncher();//instantiate it fresh every time
		
	}

	/**
	 * Test method for {@link math.example.NumberCruncher#addNumbers(int, int)}.
	 */
	@Test
	void testAddNumbersIntInt() {
		int expected = 5;
		int actual = numberCruncher.addNumbers(num1, num2);
		
		//compare
		assertEquals(expected, actual);
		
	}

	/**
	 * Test method for {@link math.example.NumberCruncher#addNumbers(int, int, int)}.
	 */
	@Test
	void testAddNumbersIntIntInt() {
//		int expected = 9;
//		int actual = numberCruncher.addNumbers(num1, num2, num3);
//		
//		//compare
//		assertEquals(expected, actual);
		assertEquals(9, numberCruncher.addNumbers(num1, num2, num3));
	}
	
	@Test
	void testMultiplyNumbersIntIntInt() {
		assertEquals(24, numberCruncher.multiplyNumbers(num1, num2, num3));
	}
	
	@Test
	void testDivideNums() {
		double expected = 3.3;
		try {
			assertEquals(expected, numberCruncher.divideNumbers(10, 3), 0.1); // with a delta 
		} catch (Exception e) {
		}
		}
		
	@Test
	void testDivException(){
		Exception exception = assertThrows(Exception.class, () -> {
			numberCruncher.divideNumbers(2, 6);
		});
	
		assertEquals("Invalid divide by zero", exception.getMessage());//makes sure we got the exception we were expecting
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

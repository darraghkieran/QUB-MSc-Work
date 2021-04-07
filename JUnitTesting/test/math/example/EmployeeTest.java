/**
 * 
 */
package math.example;

//might as well group together valid and invalid numbers from our BVA  

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import math.example.Employee;

/**
 * @author DKieran
 *
 */
class EmployeeTest {

	// test data

	// age
	int ageLowerValid, ageMidValid, ageUpperValid, ageLowerInvalid, ageUpperInvalid;

	// name
	String nameValid, nameInvalid;

	Employee employee;

	@BeforeEach
	void setUp() throws Exception {
		ageLowerValid = 18;
		ageMidValid = 25;
		ageUpperValid = 30;

		ageLowerInvalid = 17;
		ageUpperInvalid = 31;

		nameValid = "Aidan";
		nameInvalid = "";
		employee = new Employee();

	}

	// test get and sets together
	@Test
	void testGetSetNameValid() {
		employee.setName(nameValid);
		assertEquals(nameValid, employee.getName());
	}

//	@Test
//	void testGetSetNameInvalid() throws IllegalArgumentException{
//		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
//			employee.setName(nameInvalid);
//		});
//
//	}

	// sensible to combine all 3 here as they are logically fitting - all confirm if
	// age valid so if any break, you'll know that something broke in this method
	// and the which one failed. More test cases = worse capability. If there were
	// 100s then maybe it should be broken down.

	@Test
	void testGetSetAgeValid() {
		
		employee.setAge(ageLowerValid);
		assertEquals(ageLowerValid, employee.getAge());
		
		employee.setAge(ageMidValid);
		assertEquals(ageMidValid, employee.getAge());
		
		employee.setAge(ageUpperValid);	
		assertEquals(ageUpperValid, employee.getAge());
		
		
	

		
	}

	// in terms of naming - does the name clearly reveal what test is going to do?
	// here, we're looking for the unchecked exception in order for the test to be
	// passed
	@Test
	void testGetSetAgeInvalid() {

		// look for an illegal argument exception and pass if one is found for
		// ageLowerInvalid being passed to employee.setAge
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			employee.setAge(ageLowerInvalid);
		});

		// repeat for ageUpperInvalid
		exception = assertThrows(IllegalArgumentException.class, () -> {
			employee.setAge(ageLowerInvalid);
		});

		// make sure that the message that was thrown by the exception object matches a
		// specific String(which we could create as test data if we wanted)
		assertEquals("INVALID AGE", exception.getMessage());
	}

	@Test
	void testContructorValid() throws Exception {
		Employee employee = new Employee(nameValid, ageMidValid);

		assertEquals(nameValid, employee.getName());
		assertEquals(ageMidValid, employee.getAge());
	}

	@Test
	void testConstructorInvalid() {

		// tests for invalid age
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			Employee employeeConst = new Employee(nameValid, ageUpperInvalid);
		});

//        // test for invalid name
//        exception = assertThrows(IllegalArgumentException.class, ()-> {
//            Employee employeeConst = new Employee(nameInvalid, ageMidValid);
//        });
	}

}

/**
 * 
 */
package p240084448;

import java.util.ArrayList;

/**
 * @author Darragh Kieran - 40084448
 *
 */
public class CarFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FamilySaloon fs1 = new FamilySaloon("Audi", "TT", 459, true);
		RallyCar rc1 = new RallyCar("Honda", "6900+", 456, 99.3);
		F1 f11 = new F1("Mercades", "Diablo", 323, 300);

		ArrayList<Car> cars = new ArrayList<>();
		cars.add(fs1);
		cars.add(rc1);
		cars.add(f11);

		outputList(cars);
		System.out.println("\nModel with Lowest Horse Power:");
		displayLowestHorsePower(cars);
		System.out.printf("Average HorsePower: %.2f", averageHorsePower(cars));
	
		

	}

	/**
	 * 
	 * @param cars
	 */
	public static void outputList(ArrayList<Car> cars) {
		int counter = 1;
		for (Car car : cars) {
			System.out.println("--------------------" + "\nCar number " + counter + ":\n");
			car.displayAll();
			counter++;
		}
	}

	/**
	 * finds 
	 * @param cars
	 */
	public static void displayLowestHorsePower(ArrayList<Car> cars) {
		Car lowest = cars.get(0);
				
		for (Car car : cars) {
			if (car.getHorsePower() < lowest.getHorsePower()) {
				lowest = car;	
			}
		}
		
		displaySingleModel(lowest.getModel());
	
		
	}

	/**
	 * displays a single model taken in as param
	 * @param model
	 */
	public static void displaySingleModel(String model) {
		System.out.println(model);
	}
	
	
	/**
	 * 
	 * @param cars
	 * @return
	 */
	public static double averageHorsePower(ArrayList<Car> cars) {
		int total=0;
		for (Car car : cars) {
			total += car.getHorsePower();
		}
		return ((double)total/cars.size());
	}
}

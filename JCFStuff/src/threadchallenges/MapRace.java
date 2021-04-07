/**
 * 
 */
package threadchallenges;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapRace {

	public static void main(String[] args) {

		// Map to hold race results - Key (time) Value (Runner's name)
		// using TreeMap as it will order the keys
		SortedMap<Double, String> raceResults = new TreeMap<Double, String>();
		raceResults.put(9.81, "Bolt");
		raceResults.put(9.89, "Galtin");
		raceResults.put(9.91, "Degrasse");
		raceResults.put(9.94, "Simbine");
		raceResults.put(11.99, "Some guy");
		raceResults.put(9.96, "Meite");
		raceResults.put(10.04, "Vicaut");
		raceResults.put(10.06, "Bromell");
		raceResults.put(13.09, "Some other guy");
		raceResults.put(9.93, "Blake");

		// simulating the race ... times are printed at the exact time the runner finished 
		System.out.println("2016 Olympic 100 meters race simulator\n");
		starterOrders("ON YOUR MARKS", 2000);
		starterOrders("READY ... ", 3000);
		starterOrders("BANG !", 0);
		System.out.println("Race started ....");
		
		// each runner will be a thread 
		for (Double raceTime : raceResults.keySet()) {
		 RacerThread racerThread = new RacerThread();
		 // get and set this runner's finish time & name
		 racerThread.setTimeTaken(raceTime); 
		 racerThread.setName(raceResults.get(raceTime));
		 Thread t = new Thread(racerThread); 
		 // start the runner
		 t.start(); 
		}
	}

	
	/**
	 * Provides a 1 sec delay between starter's orders
	 * @param order
	 */
	private static void starterOrders(String order, long delay)  {
		
		try {
			System.out.println(order);
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

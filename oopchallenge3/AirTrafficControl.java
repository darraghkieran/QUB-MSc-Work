/**
 * 
 */
package oopchallenge3;

/**
 * @author DKieran
 *
 */
public class AirTrafficControl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create objects
		Flight f1 = new Flight("ESY3214", "Belfast", "Amsterdam", 2.2);
		Flight f2 = new Flight("BA127", "London Heathrow", "Capetown", 11.5);
		Flight f3 = new Flight("AE999", "Dublin", "New York FJK", 7.5);
		Flight f4 = new Flight("AA678", "Dublin", "Newwark", 8.5);
		Flight f5 = new Flight("AUS12", "Bejing", "Paris", 0);

//		//output objects
//		System.out.println(f1.toString());
//		System.out.println(f2.toString());
//		System.out.println(f3.toString());
//		System.out.println(f4.toString());
		System.out.println(f5.toString());

		// add objects to an array
		Flight[] flights = { f1, f2, f3, f4 };
//		//output array
//		for (int loop = 0; loop < flights.length; loop++) {
//			System.out.println(flights[loop]);
//		}
//		
//		//access object stored at a particular element in array
//		System.out.println(flights[2].getDuration());
//		
		System.out.println("Longest flight duration(hours): " + findsLongestDuration(flights));
		
		System.out.println("Searched for destination Flight instances: ");
		searchesForDestination("Dublin", flights);
	}

	/**
	 * Returns longest duration of any flight in array
	 * @param flights
	 * @return
	 */
	public static double findsLongestDuration(Flight[] flights) {

		double longest = flights[0].getDuration();

		for (int loop = 0; loop < flights.length; loop++) {
			if (flights[loop].getDuration() > longest) {
				longest = flights[loop].getDuration();
			}
		}
		return longest;

	}


	/**
	 * Searches array and returns specified destination if present
	 * @param city
	 * @param flights
	 */
	public static void searchesForDestination(String city, Flight[] flights) {
		String match = null;
		for (Flight flight : flights) {
			if (flight.getDestination().equalsIgnoreCase(city)) {
				match = flight.getFlightNumber();
				outputsFlightNumber(match);
			}
		}
		
	}
	
	/**
	 * outputs flight number to screen when called by searchesFroDestination method
	 * @param match
	 */
	public static void outputsFlightNumber(String match) {
		System.out.println(match);
	}
}

/**
 * 
 */
package oopchallenge3;

import java.util.ArrayList;

/**
 * @author DKieran
 *
 */
public class CityAdmin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String countryToBeSearched = "USA";

		City c1 = new City("Beijing", 11, true, "China");
		City c2 = new City("Madrid", 5, true, "Spain");
		City c3 = new City("Rome", 6, true, "Italy");
		City c4 = new City("New York", 8, false, "USA");
		City c5 = new City("Washington D.C", 2, true, "USA");
		City c6 = new City("Dallas", 3, false, "USA");
		// ArrayList<City> cities = new ArrayList<>();
		City[] cities = { c1, c2, c3, c4, c5, c6 };

		displayAll(cities);
		System.out.println("Smallest population is " + smallestPopulation(cities) + " million");
		capitalsFinder(cities);
		System.out.println("The following cities are in " + countryToBeSearched + " :");
		countryDecider(countryToBeSearched, cities);
		System.out.printf("Average population = %.2f million", calculatesAveragePopulation(cities));

	}

	/**
	 * 
	 * @param cities
	 */
	public static void displayAll(City[] cities) {
		for (City city : cities) {
			System.out.println(city.toString());
		}
	}

	/**
	 * returns smallest population (millions)
	 * 
	 * @param cities
	 * @return
	 */
	public static int smallestPopulation(City[] cities) {
		int smallest = cities[0].getPopulation();
		for (int loop = 0; loop < cities.length; loop++) {
			if (cities[loop].getPopulation() < smallest) {
				smallest = cities[loop].getPopulation();
			}
		}
		return smallest;
	}

	/**
	 * finds which cities in passed array are capitals
	 * 
	 * @param cities
	 */
	public static void capitalsFinder(City[] cities) {
		System.out.println("Capital cities and their countries: ");
		for (int loop = 0; loop < cities.length; loop++) {
			if (cities[loop].isCountryCapital() == true) {
				displayCityAndCountry(cities[loop].getCityName(), cities[loop].getCountry());
				// System.out.println(cities[loop].getCityName());
			}
		}
	}

	/**
	 * displays the names of cities and their counties passed as parameters
	 * 
	 * @param cityName
	 * @param countryName
	 */
	public static void displayCityAndCountry(String cityName, String countryName) {
		System.out.println(cityName + ", " + countryName);
	}

	/**
	 * Decides if cities in array are in a country given as parameter
	 * 
	 * @param country
	 * @param cities
	 */
	public static void countryDecider(String country, City[] cities) {
		for (int loop = 0; loop < cities.length; loop++) {
			if (cities[loop].getCountry().equalsIgnoreCase(country)) {
				displaysCity(cities[loop].getCityName());
			}
		}
	}

	/**
	 * outputs name of city to screen
	 * 
	 * @param cityName
	 */
	public static void displaysCity(String cityName) {
		System.out.println(cityName);
	}

	/**
	 * Calculates and returns average population of all cities in array
	 * 
	 * @param cities
	 */
	public static double calculatesAveragePopulation(City[] cities) {
		double total = 0;
		double average = 0;
		for (int loop = 0; loop < cities.length; loop++) {
			total += cities[loop].getPopulation();
		}
		System.out.println(cities.length);
		average = (total / cities.length);
		return average;
	}

}

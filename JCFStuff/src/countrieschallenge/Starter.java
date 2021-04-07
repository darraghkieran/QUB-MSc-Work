package countrieschallenge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Reads in the data - coding and cleaning where necessary and outputs various
 * analysis
 * 
 * @author Aidan
 *
 */
public class Starter {

	// stores the country data
	public static List<Country> countries = new ArrayList<Country>();

	/**
	 * Start point for the app
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		readCountryData();
		showAllCountryData(countries);

		// some data analysis

		// 1. Show each country by region
		System.out.println("Regional data - Asia");
		List<Country> regionalCountries = getCountriesByRegion("Asia");
		showCountryAndRegionData(regionalCountries);

		// 2. sort and show each county by population (ascending)
		System.out.println("Countries by population ascending");
		Collections.sort(countries, new CompareByPopulation());
		showCountryByPopulation(countries);

		// loads more you expand and try out ... e.g.
		getTotalPopPerRegion(); // this one groups info per region - note use of longs ! 
		
		// sort and show each county by population descending
		
		// find the country with the highest population density 
		
		// sort all counties by population density
		// write the data (in the list) to a new csv file...

	}

	/**
	 * Gets total population per region
	 */
	public static void getTotalPopPerRegion() {
		Map<String, Long> regions = new HashMap<String, Long>();

		for (Country c : countries) {
			// if new region found add
			if (!regions.containsKey(c.getRegion())) {
				// new region and add population to the region
				regions.put(c.getRegion(), (long)c.getPopulation());
				System.out.println("Added " + c.getRegion() + " " + c.getName());
			} else {
				// have this region and a current total so need to update
				Long currentPop = regions.get(c.getRegion());
				Long updatePop = currentPop += (long)c.getPopulation();
				regions.put(c.getRegion(), updatePop);
			}
		}

		// data per region collected 
		System.out.println("Regions ");
		for (String region : regions.keySet()) {
			System.out.println(region + " : " + regions.get(region));
		}
	}

	/**
	 * Reads in and cleans the country data file
	 */
	public static void readCountryData() {
		File file = new File("countries.csv");

		FileReader fileReader;
		BufferedReader bufferedReader;
		String countryInfo;
		String[] stats;

		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);

			// parse each data point - by comma
			bufferedReader.readLine();
			// remove the header values
			countryInfo = bufferedReader.readLine();

			String region;

			do {
				// create a country
				Country country = new Country();
				stats = countryInfo.split(",");

				// parse info into parts

				// Country Region Population Area (sq. mi.)
				country.setName(stats[0].trim());

				// REGION : cleaning this one... Eastern Europe and Western Europe should be
				// recorded as Europe
				// SUB-SAHARAN AFRICA & NORTHERN AFRICA should be recorded as Africa
				// also all should be Upper case first letter only
				region = stats[1].trim();

				// change format
				region = region.substring(0, 1).toUpperCase() + region.substring(1).toLowerCase();

				if (region.equalsIgnoreCase("Eastern Europe") || region.equalsIgnoreCase("Western Europe")) {
					country.setRegion("Europe");
				} else if ((region.equalsIgnoreCase("Sub-saharan africa")
						|| region.equalsIgnoreCase("Northern africa"))) {
					country.setRegion("Africa");
				} else {
					country.setRegion(region);
				}

				country.setPopulation(Integer.parseInt(stats[2]));

				country.setArea(Integer.parseInt(stats[3]));

				// calculate and set density
				country.setDensity((double) country.getPopulation() / country.getArea());

				// add to collection of countries
				countries.add(country);

				// read the next line
				countryInfo = bufferedReader.readLine();

			} while (countryInfo != null);

			// close all
			fileReader.close();
			bufferedReader.close();

			System.out.println("Country data loaded...");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show all the country data to screen
	 */
	public static void showAllCountryData(Collection<Country> countries) {
		for (Country country : countries) {
			country.displayAllCountryDetails();
		}
	}

	/**
	 * Show country by region
	 * 
	 * @param countries
	 */
	public static void showCountryAndRegionData(Collection<Country> countries) {
		for (Country country : countries) {
			country.displayRegionAndName();
		}
	}

	/**
	 * Show all countries by population
	 * 
	 * @param countries
	 */
	public static void showCountryByPopulation(Collection<Country> countries) {
		for (Country country : countries) {
			country.displayPopulationAndName();
		}
	}

	/**
	 * filters country by chosen region
	 * 
	 * @param region
	 */
	public static List<Country> getCountriesByRegion(String region) {

		List<Country> countiresByRegion = new ArrayList<Country>();

		for (Country country : countries) {

			if (country.getRegion().equalsIgnoreCase(region)) {
				countiresByRegion.add(country);
			}
		}
		return countiresByRegion;
	}

}

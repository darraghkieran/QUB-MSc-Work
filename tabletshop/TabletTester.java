/**
 * 
 */
package tabletshop;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Represents a tablet retailer
 * 
 * @author DKieran
 *
 */
public class TabletTester {

	private static final double LOWER_LIMIT_SIZE = 10.5;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Tablet t1 = new Tablet(Manufacturer.APPLE, "IPhone X", 1499.99, false, 10.2,
				"10.2 inch Retina display A10 Fusion chip Up to 10 hours battery life");
		Tablet t2 = new Tablet(Manufacturer.SAMGSUNG, "s10", 899.99, true, 11,
				"Dual core processer 25 megapixel camera excellent battery life");
		Tablet t3 = new Tablet(Manufacturer.GOOGLE, "Pixel", 1200, true, 13,
				"Google's leading tabular device. Great specs. May alledgedly harvest your personal data but only if you enjoy the wrong type of cookies");
		Tablet t4 = new Tablet(Manufacturer.XIAOMI, "redmi", 288.30, true, 19,
				"China's foremost tablet. Excellent camera, 10 hours battery life and the last face recognition technology");

		ArrayList<Tablet> tablets = new ArrayList<>();
		tablets.add(t1);
		tablets.add(t2);
		tablets.add(t3);
		tablets.add(t4);

		// outputs all info on all tablets
		outputItemSummary(tablets);
		// outputs phones which have over a specified screen size
		System.out.println("The following phones have a screen size of at least " + LOWER_LIMIT_SIZE + " inches: ");
		searchesBySize(tablets, LOWER_LIMIT_SIZE);

		// search for products by a certain manufacturer
		System.out.println("--------------------------------------\nFound the following " + Manufacturer.GOOGLE
				+ " product(s)...\n");
		searchesForManufacturer(tablets, Manufacturer.GOOGLE);

		// note keyword search
		String keyword;
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n*\n*\n*Search tablet descriptions by word or phrase:\n*\n*\n*");
		keyword = scanner.nextLine();
		System.out.println(
				"--------------------------------------\nReturning results which mention " + keyword + "...\n");
		keyWordSearchesNotes(tablets, keyword);
		scanner.close();

	}

	/**
	 * outputs details of all tablets
	 * 
	 * @param tablets
	 */
	public static void outputItemSummary(ArrayList<Tablet> tablets) {
		if (tablets.size() < 0 || tablets == null) {
			System.out.println("No tablets to show");
		} else {
		}
		for (Tablet tablet : tablets) {
			System.out.println(tablet.allDetails());
		}
	}

	/**
	 * searches for screen sizes over a passed size and calls
	 * outputsManufactorerAndModel() for all that exceed that size
	 */
	public static void searchesBySize(ArrayList<Tablet> tablets, double SCREEN_SIZE) {
		if (tablets.size() > 0) {
			for (Tablet tablet : tablets) {
				if (tablet.getSize() > SCREEN_SIZE) {
					outputsManufacturerAndModel(tablet.getManufacturer(), tablet.getModel());
				}
			}
		} else {
			System.out.println("No tablets found");
		}
//		return found;

	}

	/**
	 * outputs manufacturer and model passed in as params
	 * 
	 * @param manufacturer
	 * @param model
	 * @return
	 */
	public static void outputsManufacturerAndModel(Manufacturer manufacturer, String model) {
		System.out.println((manufacturer.toString().toLowerCase() + " " + model));
	}

	/**
	 * Searches for a particular manufacturer passed as a parameter
	 */
	public static void searchesForManufacturer(ArrayList<Tablet> tablets, Manufacturer manufacturer) {
		if (tablets.size() == 0 || tablets == null) {
			System.out.println("No tablet manufacturers found");
		} else {
			for (Tablet tablet : tablets) {
				if (tablet.getManufacturer().equals(manufacturer)) {
					outputsManufacturerDetails(tablet.allDetails());
				}
			}
		}
	}

	/**
	 * Outputs the tablet details for a particular manufacturer
	 * 
	 * @param details
	 */
	public static void outputsManufacturerDetails(String details) {
		System.out.println(details);
	}

	/**
	 * Searches for a key word or phrase passed as a parameter
	 * 
	 * @param tablets
	 * @param keyWord
	 */
	public static void keyWordSearchesNotes(ArrayList<Tablet> tablets, String keyWord) {
		if (tablets.size() != 0 || tablets != null) {
			for (Tablet tablet : tablets) {
				if (tablet.getNotes().toLowerCase().contains(keyWord.toLowerCase())) {
					outputsManufacturerDetails(tablet.allDetails());
				} else {
					break;
				}
			}
		} else {
			System.out.println("No tablets found to be searched");
		}
		System.out.println("Search not found");
	}
}
/**
 * 
 */
package championsleague;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author DKieran
 * Read in file and perform series of tasks
 *
 */
public class UCLWinners {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		File file = new File("ECWinners (2).txt");
		FileReader fr;
		String line;
		int year, loop;

		year = 1956;
		loop = 0;

		ArrayList<String> winnersByYear = new ArrayList();
		ArrayList<String> winners = new ArrayList();

		// read in file
		try {
			fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			line = br.readLine();
			while (line != null) {
				// add all lines
				winnersByYear.add(line);

				// add non-duplicate lines
				if (!winners.contains(line)) {
					winners.add(line);
				}

				line = br.readLine();

			}
			// close all
			fr.close();
			br.close();
			
			//output all years' winners
			for (String winnerByYear : winnersByYear) {
				System.out.println(winnerByYear + "\t" + year++);

			}
			//output list of all winners
			System.out.println("\nList of winners (no duplicates):\n" + winners.toString());

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException ioe) {
			System.out.println("Problem reading file");
		} catch (Exception e) {
			System.out.println("Encountered a problem");
		}

	}

}

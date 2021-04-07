/**
 * 
 */
package scores;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Reads in CSV file and outputs contents
 * @author DKieran
 *
 */
public class ScoresCSVChallenge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// vars
		File file = new File("Scores (1).csv");
		String line, winner;
		int homeTeamScore, awayTeamScore;
		String[] tokens;

		winner = "";

		try {
			// read in csv
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			br.readLine();// read the header line

			line = br.readLine();

			while (line != null) {
				// tokenise each line in file
				tokens = line.split(",");
				// parse string scores to int
				homeTeamScore = Integer.parseInt(tokens[1]);
				awayTeamScore = Integer.parseInt(tokens[3]);

				// decide winner
				if (homeTeamScore > awayTeamScore) {
					winner = tokens[0];
				} else if (awayTeamScore > homeTeamScore) {
					winner = tokens[2];
				} else {
					winner = "Draw";
				}

				System.out.println(tokens[0] + ": " + homeTeamScore + "\t" + tokens[2] + ": " + awayTeamScore + "\t\t"
						+ "Winner: " + winner);

				line = br.readLine();// read next line

			}
			
			// close all
			fr.close();
			br.close();

		} catch (FileNotFoundException e) {
			System.out.println("File could not be found");
		} catch (IOException ioe) {
			System.out.println("Input exception");
		} catch (Exception e) {
			System.out.println("There was a problem");
		}
//		

	}

}

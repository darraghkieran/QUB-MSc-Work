/**
 * 
 */
package catch22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author DKieran
 * Read in a book and perform a series of tasks on the text
 *
 */
public class Catch22Challenges {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		File file = new File("Catch 22 (1).txt");
		File redacted = new File("Catch22RedactedVersion.txt");
		String line, newLine, characterNameCapitalized, characterNameLowerCase, characterNameUpperCase;
		int lineCounter, wordCounter, charCounter, characterNameMentions, letterCounter;
		char letterUpperC, letterLowerC;

		try {
			// set up read in
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			// set up writing out
			FileWriter fw = new FileWriter(redacted);
			BufferedWriter bw = new BufferedWriter(fw);

			// initialize vars
			characterNameCapitalized = "Yossarian";
			characterNameLowerCase = "yossarian";
			characterNameUpperCase = "YOSSARIAN";
			letterUpperC = 'A';
			letterLowerC = 'a';

			lineCounter = 0;
			wordCounter = 0;
			charCounter = 0;
			characterNameMentions = 0;
			letterCounter = 0;

			line = br.readLine();
			newLine = "\n";

			// read in text
			while (line != null) {

				// number of lines
				lineCounter++;

				// number of words
				String[] words = line.split(" ");
				wordCounter += words.length;

				for (int loop = 0; loop < line.length(); loop++) {

					// number of text characters
					if (line.charAt(loop) != '\0') {
						charCounter++;
					}
					// total instances of a certain letter
					if (line.charAt(loop) == letterLowerC || line.charAt(loop) == letterUpperC) {
						letterCounter++;
					}
				}

				// output number of times a certain character is mentioned
				if (line.contains(characterNameCapitalized) || line.contains(characterNameLowerCase)
						|| line.contains(characterNameUpperCase)) {
					characterNameMentions++;

					// replace one with the other and write to file with BufferedWriter
					String redactedLine = line.replace(characterNameCapitalized, "********");
					bw.write(redactedLine + "\n");
				}

				System.out.println(line);
				line = br.readLine();
			}

			System.out.println("\nBOOK SUMMARY... \nNumber of Lines: " + lineCounter);
			System.out.println("Number of words: " + wordCounter);
			System.out.println("Number of Characters: " + charCounter);
			System.out.println(characterNameCapitalized + " mentioned " + characterNameMentions + " times");
			System.out.println("Number of times the letter " + letterUpperC + " appears: " + letterCounter);

			//close resources
			fr.close();
			br.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not Found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Input exception");
		} catch (Exception e) {
			System.out.println("There was a problem");
		}

	}

}

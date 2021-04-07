/**
 * 
 */
package catch22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author DKieran
 *
 */
public class FRCatch22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		File file = new File("Catch 22 (1).txt");
		String line;

		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

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

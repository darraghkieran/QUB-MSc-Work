/**
 * 
 */
package catch22;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author DKieran
 *
 */
public class FWEditingCatch22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String data = "This is my review of Catch22 - I really liked it.";
		char newline = '\n';

		File file = new File("Catch 22 (2).txt");

		if (!file.exists()) {

			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("Couldn't create new file");
			}
		}

		try {
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write(newline + data);

			bw.close();
			fw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

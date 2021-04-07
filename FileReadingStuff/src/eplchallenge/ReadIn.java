/**
 * 
 */
package eplchallenge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author DKieran
 *
 */
public class ReadIn {
	
	private static ArrayList<String> results = new ArrayList<>(); 
	private static Map<String, Team> teams = new HashMap<>();
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		File file = new File("Results.txt");
		String line, home, away;
		String tokens[];
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			
			
				line = br.readLine();
			
										
			while(line!=null) {
				//tokenize
				tokens = line.split(" ");
				home = tokens[1];
				away = tokens[2];
				line=br.readLine();
			}
			
			fr.close();
			br.close();
			
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException ioe) {
			System.out.println("Problem reading file");
		}

		

	}

}

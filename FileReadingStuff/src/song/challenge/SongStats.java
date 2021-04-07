/**
 * 
 */
package song.challenge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author DKieran
 *
 */
public class SongStats {
	// constants
	public final static String SEARCH = "SOS";

	/**
	 * stores all songs
	 */
	public static ArrayList<Song> songs = new ArrayList<>();

	public static void main(String[] args) {

		readInSongs();

		// show all songs
		for (Song song : songs) {
			System.out.println(song.toString());
		}

		// search for a particular song
		System.out.println("\nSearching for " + SEARCH + ".......Results:\n");
		for (Song song : songs) {
			if (song.getTitle().equalsIgnoreCase(SEARCH)) {

				System.out.println(song.toString());
			}

		}
	}

	/**
	 * reads in file data
	 */
	public static void readInSongs() {

		File file = new File("songlist (1).csv");

		FileReader fr;
		BufferedReader br;
		String line;
		String[] tokens;

		try {

			fr = new FileReader(file);
			br = new BufferedReader(fr);

			br.readLine();
			line = br.readLine();

			while (line != null) {
				// split line
				tokens = line.split(",");
				// assign each part of the line to one of the instance vars of token
				Song song = new Song();
				song.setTitle(tokens[0]);
				song.setArtist(tokens[1]);
				song.setHighestPosition(Integer.parseInt(tokens[2]));

				// add song to songs arrayList
				songs.add(song);
				// read in next line
				line = br.readLine();
			}

			// show all songs
			for (Song song : songs) {
				System.out.println(song.toString());
			}

		} catch (FileNotFoundException e1) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Problem reading file");
		} catch (Exception e) {
			System.out.println("There was a problem");
		}

	}

}

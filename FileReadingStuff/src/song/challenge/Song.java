/**
 * 
 */
package song.challenge;

/**
 * @author DKieran
 * Represents a chart entry
 */
public class Song {

	// instance vars
	private String title;
	private String artist;
	private int highestPosition;

	// constructors
	/**
	 * default constructor
	 */
	public Song() {
	
	}


	/**
	 * 
	 * @param title
	 * @param artist
	 * @param highestPosition
	 * @throws Exception - based on validation
	 */
	public Song(String title, String artist, int highestPosition) throws Exception{
		this.title = title;
		this.artist = artist;
		this.setHighestPosition(highestPosition);
	}



	// methods
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}

	/**
	 * @param artist the artist to set
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}

	/**
	 * @return the highestPosition
	 * @throws Exception 
	 */
	public void getHighestPosition() throws Exception {
		if (highestPosition >= 1) {
			this.highestPosition = highestPosition;
		} else {
			throw new Exception("Invalid chart number");
		}
		
	}

	/**
	 * @param highestPosition the highestPosition to set
	 */
	public void setHighestPosition(int highestPosition) {
		this.highestPosition = highestPosition;
	}
	
	/**
	 * to string
	 */
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", highestPosition=" + highestPosition + "]";
	}

}

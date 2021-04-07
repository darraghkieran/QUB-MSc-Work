/**
 * 
 */
package eplchallenge;

/**
 * @author DKieran
 *
 */
public class Team {

	// instancec vars
	private String teamName;
	private int played;
	private int goalsFor;
	private int goalsAgainst;
	private int win;
	private int draw;
	private int loss;
	private int totalPoints;

	/**
	 * default constructor
	 */
	public Team() {

	}

	/**
	 * constructor with args
	 * 
	 * @param teamName
	 * @param played
	 * @param goalsFor
	 * @param goalsAgainst
	 * @param win
	 * @param draw
	 * @param loss
	 * @param totalPoints
	 */
	public Team(String teamName, int played, int goalsFor, int goalsAgainst, int win, int draw, int loss,
			int totalPoints) {
		this.teamName = teamName;
		this.played = played;
		this.goalsFor = goalsFor;
		this.goalsAgainst = goalsAgainst;
		this.win = win;
		this.draw = draw;
		this.loss = loss;
		this.totalPoints = totalPoints;
	}

	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}

	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	/**
	 * @return the played
	 */
	public int isPlayed() {
		return played;
	}

	/**
	 * @param played the played to set
	 */
	public void setPlayed(int played) {
		this.played = played;
	}

	/**
	 * @return the goalsFor
	 */
	public int getGoalsFor() {
		return goalsFor;
	}

	/**
	 * @param goalsFor the goalsFor to set
	 */
	public void setGoalsFor(int goalsFor) {
		this.goalsFor = goalsFor;
	}

	/**
	 * @return the goalsAgainst
	 */
	public int getGoalsAgainst() {
		return goalsAgainst;
	}

	/**
	 * @param goalsAgainst the goalsAgainst to set
	 */
	public void setGoalsAgainst(int goalsAgainst) {
		this.goalsAgainst = goalsAgainst;
	}

	/**
	 * @return the win
	 */
	public int isWin() {
		return win;
	}

	/**
	 * @param win the win to set
	 */
	public void setWin(int win) {
		this.win = win;
	}

	/**
	 * @return the draw
	 */
	public int isDraw() {
		return draw;
	}

	/**
	 * @param draw the draw to set
	 */
	public void setDraw(int draw) {
		this.draw = draw;
	}

	/**
	 * @return the loss
	 */
	public int isLoss() {
		return loss;
	}

	/**
	 * @param loss the loss to set
	 */
	public void setLoss(int loss) {
		this.loss = loss;
	}

	/**
	 * @return the totalPoints
	 */
	public int getTotalPoints() {
		return totalPoints;
	}

	/**
	 * @param totalPoints the totalPoints to set
	 */
	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}

	@Override
	public String toString() {
		return "TeamStats [teamName=" + teamName + ", played=" + played + ", goalsFor=" + goalsFor + ", goalsAgainst="
				+ goalsAgainst + ", win=" + win + ", draw=" + draw + ", loss=" + loss + ", totalPoints=" + totalPoints
				+ "]";
	}

}

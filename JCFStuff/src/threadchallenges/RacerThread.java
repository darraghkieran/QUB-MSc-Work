/**
 * 
 */
package threadchallenges;

public class RacerThread implements Runnable {

	private Double timeTaken;
	private String name;

	@Override
	public void run() {

		try {

			// change the time (Double to a long)
			Double timeInMillisecs = this.getTimeTaken() * 1000;
			long timeMillisecs = timeInMillisecs.longValue();
			Thread.sleep(timeMillisecs);
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted");
		}
		System.out.printf("%S finished at : %.2f \n", this.getName(), this.getTimeTaken());
	}

	public Double getTimeTaken() {
		return timeTaken;
	}

	public void setTimeTaken(Double timeTaken) {
		this.timeTaken = timeTaken;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

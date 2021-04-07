package threadstuff;

public class ThreadNames {

	public static void main(String[] args) {

		ThreadOutputsName nameThread = new ThreadOutputsName();// create obj

		Thread thread = new Thread(nameThread, "Wee thread");// pass obj and a reference name 
															 // for thread to a Thread var

		thread.start();// make it begin

	}
}

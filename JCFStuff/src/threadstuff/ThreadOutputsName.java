package threadstuff;

public class ThreadOutputsName implements Runnable {
	@Override
	public void run() {

		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " is running");
	}

}

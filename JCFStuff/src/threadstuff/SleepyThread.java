package threadstuff;

import java.util.Random;

public class SleepyThread implements Runnable {
	    @Override
	    public void run() {
	        try {
	            System.out.println("Sleepy thread - about to sleep");
	            Thread.sleep(new Random().nextInt(20000));
	            System.out.println("SleepyThread - awake again !");
	        } catch (InterruptedException e) {
	            System.out.println("Sleepy thread interrupted");
	        }
	    }

}

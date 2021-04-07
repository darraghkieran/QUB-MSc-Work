/**
 * 
 */
package recursivestuffrecursivestuff;

/**
 * @author DKieran
 *
 */
public class CallMe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        callMe(1);
    }
    
    public static void callMe(int num) {
        
        System.out.println("Call me ....."+ num++);
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        callMe(num); // recursive call !!!!
    }

}

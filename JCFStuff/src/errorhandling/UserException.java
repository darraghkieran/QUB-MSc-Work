/**
 * 
 */
package errorhandling;

/**
 * creates custom exception
 * @author Darragh Kieran 40084448
 *
 */
public class UserException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * default constructor
	 */
	public UserException() {
	}

	/**
	 * Constructor for UserException error
	 * 
	 * @param message
	 */
	public UserException(String message) {
		super(message);
	}

}

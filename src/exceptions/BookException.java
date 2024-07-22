package exceptions;

/**
* BookException
* <p>
* This is our BookException class with its method 
* BookException
*/

public class BookException extends Exception {
	/**
	* BookException()
	* <p>
	* This is the constructor  
    * More details are in the Exception suite.	
    * 
    */	
	public BookException() {
		super("Something went wrong. Try booking again!");
		// TODO Auto-generated constructor stub
	}

	public BookException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public BookException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public BookException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public BookException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}

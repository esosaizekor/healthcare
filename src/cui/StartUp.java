package cui;

import domein.DomeinController;
import exceptions.BookException;

/**
* StartUp 
* <p>
* This is our StartUp class with the methods 
* main
*
*/

public class StartUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new HealthCareApp().Start(new DomeinController(),1);
		} catch (BookException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}

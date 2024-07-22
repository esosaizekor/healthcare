package cui;

import domein.DomeinController;

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
		new HealthCareApp().Start(new DomeinController());
				
	}

}

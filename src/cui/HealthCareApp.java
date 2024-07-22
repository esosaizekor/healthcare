package cui;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Scanner;

import domein.DomeinController;
import domein.Language;
import dto.AppointmentDTO;
import dto.HealthCareProfessionalDTO;
import exceptions.BookException;
import persistentie.Lang_en;
import persistentie.Lang_nl;

/**
* HealthCareApp
* <p>
* This is our HealthCareApp class with the methods 
* Start
* getAppointments
* PrintExistingAppointment
* multiLanguageSupport
*/

public class HealthCareApp implements Language {
	
	private HealthCareProfessionalDTO hcpDTO = null;  // healthcareprofessional data transfer object
	private AppointmentDTO apDTO = null; // appointment data transfer object
	private String bookFault = ""; // book exception
	private String welcomeMSg = ""; // welcome message
	

	/**
	* Start(DomeinController DC)
	* <p>
	* All booking and healthcareprofessionals are loaded  
    * @param  DC DC
	 * @throws BookException 
	*/
	
	public void Start(DomeinController DC,int language) throws BookException
	{
		hcpDTO = DC.getHealthCareProfessionals();
		apDTO = DC.getAppointments();
		
		
		
		Scanner invoer = new Scanner(System.in);

		System.out.println("\n--------------------------------------------\n");
		System.out.println(hcpDTO.hcp().toString());
		PrintExistingAppointment();		
		
		try
		{

						
			System.out.println("?? (1) EN (2) NL (3) FR ?? : ");
			// Ons resourcebundle
			
			multiLanguageSupport(invoer.nextInt());	
			System.out.println(this.welcomeMSg);	
			
		}
		catch(InputMismatchException iM )
		{
			throw new BookException(this.bookFault);
			
		}
		
	}

	
	/**
	* public void PrintExistingAppointment()
	* <p>
	* Print all existing bookings. 
	*/
	
	
	public void PrintExistingAppointment()
	{
		if(apDTO.ap().size() == 0)
		{
			System.out.println("\n--------------------------------------------\n");
			String.format("\n %s \n",bookFault);
			
		}
		else
		{
			System.out.println("\n--------------------------------------------\n");
			System.out.println(apDTO.ap().toString());
		}
	}

	/**
	* multiLanguageSupport(int currentLanguage) {
	* <p>
	* multi-language support / taalOndersteuning from resourceBundle  
    * @param  currentLanguage currentLanguage
	*/
	
	@Override
	public void multiLanguageSupport(int currentLanguage) {
				
		// TODO Auto-generated method stub
		try
		{
		    //                   ( Locale.FRENCH |  Locale.FRANCE) 
			
			Locale currentLocale = new Locale(Locale.getDefault().getLanguage(),Locale.getDefault().getCountry());
			ResourceBundle myResources;

			myResources = switch(currentLanguage)
			{
				case 1 -> ResourceBundle.getBundle(Lang_en.class.getName(), currentLocale); // my[taal]Resource...
				case 2 -> ResourceBundle.getBundle(Lang_nl.class.getName(), currentLocale); // my[taal]Resource...
				case 3 -> ResourceBundle.getBundle("Lang_fr", currentLocale); // my[taal]Resource...
				default-> ResourceBundle.getBundle(Lang_en.class.getName(), currentLocale); // my[taal]Resource...
			};

			switch(currentLanguage)
			{
				case 1:
				{
					this.bookFault = myResources.getString("HEALTHCARE_HEALTHCAREAPP_BOOKEXCEPTION"); // book exception
					this.welcomeMSg = myResources.getString("HEALTHCARE_HEALTHCAREAPP_WELCOME"); // book exception
					break;
				}
				
				// my[taal]Resource...
				case 2: 
				{
					this.bookFault = myResources.getString("HEALTHCARE_HEALTHCAREAPP_BOOKEXCEPTIE"); // book exceptie
					this.welcomeMSg = myResources.getString("HEALTHCARE_HEALTHCAREAPP_WELKOM"); // book exceptie
					
					break;
				}
				case 3: {
					
					break;
				}
				default: break;
				// my[taal]Resource...
				
			};
			
			
			
			// Locale.getDefault().getLanguage(),(Locale.getDefault().getCountry() wat is het? 
			//Locale.setDefault(Locale.ENGLISH); // en_us
			
		
		}
		catch(MissingResourceException mRe)
		{
			System.err.print(mRe.getMessage());
		} 
		
		switch(currentLanguage)
		{
			case 1 -> Locale.setDefault(Locale.ENGLISH);
			case 2 -> Locale.setDefault(new Locale("nl"));
			case 3 -> Locale.setDefault(Locale.FRENCH);
			default-> Locale.setDefault(new Locale(Locale.getDefault().getLanguage(),Locale.getDefault().getCountry()));
		}
		
	
	}

}

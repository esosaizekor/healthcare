package cui;

import domein.DomeinController;
import dto.AppointmentDTO;
import dto.HealthCareProfessionalDTO;

/**
* HealthCareApp
* <p>
* This is our HealthCareApp class with the methods 
* Start
* getAppointments
* PrintExistingAppointment
*/

public class HealthCareApp {
	
	HealthCareProfessionalDTO hcpDTO = null;
	AppointmentDTO apDTO = null;

	/**
	* Start(DomeinController DC)
	* <p>
	* All booking and healthcareprofessionals are loaded  
    * @param  DC DC
	*/
	
	public void Start(DomeinController DC)
	{
		hcpDTO = DC.getHealthCareProfessionals();
		apDTO = DC.getAppointments();
		
		System.out.println("\n--------------------------------------------\n");
		System.out.println(hcpDTO.hcp().toString());
		PrintExistingAppointment();		
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
			System.out.println("\n No bookings. \n");
			
		}
		else
		{
			System.out.println("\n--------------------------------------------\n");
			System.out.println(apDTO.ap().toString());
		}
	}

}

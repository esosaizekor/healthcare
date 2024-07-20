package cui;

import domein.DomeinController;
import dto.AppointmentDTO;
import dto.HealthCareProfessionalDTO;

public class HealthCareApp {
	
	HealthCareProfessionalDTO hcpDTO = null;
	AppointmentDTO apDTO = null;
	
	public void Start(DomeinController DC)
	{
		hcpDTO = DC.getHealthCareProfessionals();
		apDTO = DC.getAppointments();
		
		System.out.println("\n--------------------------------------------\n");
		System.out.println(hcpDTO.hcp().toString());
		PrintExistingAppointment();		
	}
	
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

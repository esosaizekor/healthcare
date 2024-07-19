package cui;

import domein.DomeinController;
import dto.HealthCareProfessionalDTO;

public class HealthCareApp {
	
	HealthCareProfessionalDTO hcpDTO = null;
	
	public void Start(DomeinController DC)
	{
		hcpDTO = DC.getHealthCareProfessionals();
		
		System.out.println("\n---------------------------------------------\n");
		System.out.println(hcpDTO.hcp().toString());
		
	}
}

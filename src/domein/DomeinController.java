package domein;

import dto.HealthCareProfessionalDTO;

public class DomeinController {

	HealthCareProfessionalRepository hcr =  null;
	
	public DomeinController() {
		hcr = new HealthCareProfessionalRepository();
		
		// TODO Auto-generated constructor stub
	}
	
	public HealthCareProfessionalDTO getHealthCareProfessionals()
	{
		return new HealthCareProfessionalDTO(hcr.getHealthCareProfessionals());
	}

}

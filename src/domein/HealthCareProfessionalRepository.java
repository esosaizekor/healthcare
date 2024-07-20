package domein;

import java.util.List;

import persistentie.HealthCareProfessionalMapper;

public class HealthCareProfessionalRepository {

	public HealthCareProfessionalMapper hcpm;
	
	public HealthCareProfessionalRepository() {
		hcpm = new HealthCareProfessionalMapper();
		// TODO Auto-generated constructor stub
	}
	
	public List<HealthCareProfessional> getHealthCareProfessionals()
	{
		return hcpm.getHealthCareProfessionals();
	}
	
	public HealthCareProfessional getHealthCareProfessional(String fullname)
	{
		HealthCareProfessional newHcp = null;
		
		for(HealthCareProfessional hcp : hcpm.getHealthCareProfessionals())
		{
			if (hcp.getFullname().equals(fullname))
			{
				newHcp =  hcp;	
				break;
			}			
			
		}
		
		return newHcp;
	}

}

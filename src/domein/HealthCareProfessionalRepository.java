package domein;

import java.util.List;

import persistentie.HealthCareProfessionalMapper;
/**
* HealthCareProfessionalRepository
* <p>
* This is our HealthCareProfessionalRepository class with the methods 
* getHealthCareProfessionals
* getHealthCareProfessional
*/
public class HealthCareProfessionalRepository {

	public HealthCareProfessionalMapper hcpm;
	
	public HealthCareProfessionalRepository() {
		hcpm = new HealthCareProfessionalMapper();
		// TODO Auto-generated constructor stub
	}
	/**
	* getHealthCareProfessionals()
	* <p>
	* Returns all appointments 
	*/	
	public List<HealthCareProfessional> getHealthCareProfessionals()
	{
		return hcpm.getHealthCareProfessionals();
	}
	/**
	* getHealthCareProfessional()
	* <p>
	* Returns all appointments 
	*/		
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

package persistentie;

import java.util.ArrayList;
import java.util.List;

import domein.Dentist;
import domein.Dietitian;
import domein.GeneralPractitioners;
import domein.HealthCareProfessional;
import domein.Nurse;

public class HealthCareProfessionalMapper {
	
	private List<HealthCareProfessional> hcp;
	
	public HealthCareProfessionalMapper() {
		super();
		hcp = new ArrayList<HealthCareProfessional>();
		
		hcp.add(new HealthCareProfessional(1, "Joel Guoy", new GeneralPractitioners("Joel Guoy")));
		hcp.add(new HealthCareProfessional(2, "Milley Bright", new GeneralPractitioners("Milley Bright")));
		hcp.add(new HealthCareProfessional(3, "Pulot Megda", new GeneralPractitioners("Pulot megda")));

		hcp.add(new HealthCareProfessional(4, "Damon Spas", new Dentist("Damon spas")));
		hcp.add(new HealthCareProfessional(5, "Terry Fad", new  Dentist("Terry fad")));

		hcp.add(new HealthCareProfessional(6, "Amy Goldy", new Dietitian("Amy goldy")));
		hcp.add(new HealthCareProfessional(7, "Matt Andrews", new Dietitian("Pulot megda")));
		
		hcp.add(new HealthCareProfessional(8, "Tim dams", new Nurse("Tim dams")));
		hcp.add(new HealthCareProfessional(9, "Aya Salfa", new Nurse("Aya Salfa")));
		
		// TODO Auto-generated constructor stub
		
		

	}

	public List<HealthCareProfessional> getHealthCareProfessionals()
	{
		return hcp;
	}
	
	
}

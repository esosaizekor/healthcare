package persistentie;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.Set;

public class Lang_nl extends ResourceBundle {


	public Lang_nl() {
		// TODO - implement Lang.Lang
		
	}

	@Override
	protected Object handleGetObject(String key) {
		// TODO Auto-generated method stub
		 // ------- HealthCareApp ----- 
			if (key.equals("HEALTHCARE_HEALTHCAREAPP_BOOKEXCEPTIE")) return "D'r gaat iets mis. Probeer later opnieuw!";
			if (key.equals("HEALTHCARE_BOOKEXCEPTION_BOOKEXCEPTIE")) return "D'r gaat iets mis. Probeer later opnieuw!";
			if (key.equals("HEALTHCARE_HEALTHCAREAPP_WELKOM")) return "--- Welkom op overal zorg! --- \\n\\n!";
	     // ------- Domein Controller
	        
	     // ------- Appointment
			
		 // ------- Cleaner

		 // ------- Dentist

		 // ------- Dietitian
	     
	     // ------- Nurse

		 // -------- AppointmentMapper
	       
	         
	         
	         return null;	}

	@Override
	public Enumeration<String> getKeys() {
		// TODO Auto-generated method stub
		return Collections.enumeration(keySet());
	}

	@Override
	protected Set<String> handleKeySet() {
		// TODO Auto-generated method stub
		 return new HashSet<String>(Arrays.asList("HEALTHCARE_HEALTHCAREAPP_BOOKEXCEPTIE", // book exceptie
				 
				 // ------- HealthCareApp -----

				 // ------- Domein Controller
				 "", // 
		 
			        
			     // ------- Appointment
					
				 // ------- Cleaner

				 // ------- Dentist

				 // ------- Dietitian
			     
			     // ------- Nurse

			 
			 	 // ------- BookException
				 "HEALTHCARE_BOOKEXCEPTION_BOOKEXCEPTIE", // book exceptie
			 	 
			 	 // ------ AppointmentMapper
			 	 ""));
		 
		 	 
	}

}
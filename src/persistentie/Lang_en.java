package persistentie;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;

public class Lang_en extends Lang_nl {

	@Override
	protected Object handleGetObject(String key) {
		// TODO Auto-generated method stub
		
		
	 // ------- HealthCareApp ----- 
		if (key.equals("HEALTHCARE_HEALTHCAREAPP_BOOKEXCEPTION")) return "Something went wrong. Try booking again!";
		if (key.equals("HEALTHCARE_BOOKEXCEPTION_BOOKEXCEPTION")) return "Something went wrong. Try booking again!";
		if (key.equals("HEALTHCARE_HEALTHCAREAPP_WELCOME")) return "--- Welcome to good H E A L T H! --- \\n\\n!";
     // ------- Domein Controller
        
     // ------- Appointment
		
	 // ------- Cleaner

	 // ------- Dentist

	 // ------- Dietitian
     
     // ------- Nurse

	 // -------- AppointmentMapper
        
        
         return null;
	}

	@Override
	public Enumeration<String> getKeys() {
		// TODO Auto-generated method stub
		return super.getKeys();
	}

	@Override
	protected Set<String> handleKeySet() {
		// TODO Auto-generated method stub
		 return new HashSet<String>(Arrays.asList("HEALTHCARE_HEALTHCAREAPP_BOOKEXCEPTION", // book exception
				 "EALTHCARE_HEALTHCAREAPP_WELCOME",
				 // ------- HealthCareApp -----

				 // ------- Domein Controller
				 "", // 
		 
			        
			     // ------- Appointment
					
				 // ------- Cleaner

				 // ------- Dentist

				 // ------- Dietitian
			     
			     // ------- Nurse

			 
			 	 // ------- BookException
				 "HEALTHCARE_BOOKEXCEPTION_BOOKEXCEPTION", // book exception
			 	 
			 	 // ------ AppointmentMapper
			 	 ""));
		 
		 
	}

}

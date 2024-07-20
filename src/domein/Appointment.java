package domein;

import java.sql.Time;

import exceptions.BookException;

public class Appointment {

   private String fullname;
   private String mobilephone;
   private Time prefferedtimeslot;
   private HealthCareProfessional hcp;

   public Appointment(String fullname, String mobilephone, Time prefferedtimeslot, HealthCareProfessional hcp) {
	
	try {
		this.setFullname(fullname);
		this.setMobilephone(mobilephone);
	} catch (BookException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	this.setPrefferedtimeslot(prefferedtimeslot);
	this.setHcp(hcp);
   }
   
   public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) throws BookException {		

		if(fullname instanceof String)
		{
			if(fullname.isEmpty() || fullname.isBlank() || fullname.equals(null))
			{
				throw new BookException("Name not valid!");				
			}
			else
			{
				this.fullname = fullname;
				
			}
	
		}
	
	}

	public String getMobilephone() {
		return mobilephone;
	}

	public void setMobilephone(String mobilephone) throws BookException {
		
		if(mobilephone instanceof String)
		{
			if(mobilephone.isEmpty() || mobilephone.isBlank() || mobilephone.equals(null))
			{
				throw new BookException("Number not valid!");				
			}
			else
			{
				this.mobilephone = mobilephone;
				
			}
	
		}
		
		
	}

	public Time getPrefferedtimeslot() {
		return prefferedtimeslot;
	}

	public void setPrefferedtimeslot(Time prefferedtimeslot) {
		this.prefferedtimeslot = prefferedtimeslot;
	}

	public HealthCareProfessional getHcp() {
		return hcp;
	}

	public void setHcp(HealthCareProfessional hcp) {
		this.hcp = hcp;
	
	}   
	
	@Override
	public String toString() {
		return String.format("An %s by %s was booked at %s for %s a %s. \n", this.getClass().getSimpleName(),
																this.getFullname(),
																this.prefferedtimeslot.toString(),
																this.getHcp().getFullname(),
																this.getHcp().getClass().getSimpleName());
	}
	
}

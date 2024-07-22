package domein;

import java.sql.Time;

import exceptions.BookException;

/**
* Appointment
* <p>
* This is our Appointment class with the methods 
* getFullname
* setFullname
* getMobilephone
* setMobilephone
* getPrefferedtimeslot
* setPrefferedtimeslot
* getHcp				
* setHcp
*/

public class Appointment {

   private String fullname;
   private String mobilephone;
   private Time prefferedtimeslot;
   private HealthCareProfessional hcp;

	/**
	* Appointment(String fullname, String mobilephone, Time prefferedtimeslot, HealthCareProfessional hcp) 
	* <p>
	* All bookings are created here
   * @param  fullname fullname
   * @param  mobilephone mobilephone
   * @param  prefferedtimeslot prefferedtimeslot 
   * @param  hcp hcp 
   * 	*/
   
   public Appointment(String fullname, String mobilephone, Time prefferedtimeslot, HealthCareProfessional hcp) {
	
	try {
		this.setFullname(fullname);
		this.setMobilephone(mobilephone);
		this.setPrefferedtimeslot(prefferedtimeslot);
		this.setHcp(hcp);
	} catch (BookException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
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

	public void setPrefferedtimeslot(Object prefferedtimeslot) throws BookException {
		
		if(prefferedtimeslot instanceof Time)
		{
			if(prefferedtimeslot.toString().isEmpty() || prefferedtimeslot.toString().isBlank() || prefferedtimeslot.toString().equals(null))
			{
				throw new BookException("Number not valid!");				
			}
			else
			{
				this.prefferedtimeslot = (Time)prefferedtimeslot;
				
			}
	
		}
		
		if(prefferedtimeslot instanceof String)
		{
			Time newT = null;
			newT = Time.valueOf((String)prefferedtimeslot);
			
			if(newT instanceof Time)
			{
				this.prefferedtimeslot = (Time)newT;
								
			}
			else
			{
				throw new BookException("Not a valid time!");
				
			}
	
		}
						
		
	}


	public HealthCareProfessional getHcp() {
		return hcp;
	}

	public void setHcp(HealthCareProfessional hcp) throws BookException {
	
			if(hcp != null)
			{
				if(hcp instanceof HealthCareProfessional)
				{
					this.hcp = hcp;
				}
			}
			else
			{
				throw new BookException("Please try and book again.");
			}


	
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

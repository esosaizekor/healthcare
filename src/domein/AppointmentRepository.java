package domein;

import java.sql.Time;
import java.util.List;

import persistentie.AppointmentMapper;

/**
* AppointmentRepository
* <p>
* This is our AppointmentRepository class with the methods 
* getAppointments
* getAppointment
* createNewAppointment
* cancelBooking
*/

public class AppointmentRepository {
    
	private AppointmentMapper am = null;
	
	/**
	* AppointmentRepository()
	* <p>
	* This is the constructor  
    * 	
    * 
    */	
	public AppointmentRepository() {
		 am = new AppointmentMapper();
				 
		// TODO Auto-generated constructor stub
	}
	/**
	* getAppointments()
	* <p>
	* Returns all appointments 
	*/
	
	public List<Appointment> getAppointments()
	{
		return am.getAppointments();
	}
	/**
	* getAppointment()
	* <p>
	* Returns an appointments by patients name 
	*/	
	public Appointment getAppointment(String fullname)
	{
		Appointment newap = null;
		
		for(Appointment ap : am.getAppointments())
		{
			if(ap.getFullname().equals(fullname))
			{
				newap = ap;
				break;
			}
		}
		
		return newap;
	}
	/**
	* createNewAppointment(String fullname, String mobilephone, Time prefferedtimeslot, HealthCareProfessional hcp)
	* <p>
	* Create new appointments from object Appointment 
	* @param  fullname fullname
	* @param  mobilephone mobilephone
	* @param  prefferedtimeslot prefferedtimeslot
    * @param  hcp hcp
	*/	
	public void createNewAppointment(String fullname, String mobilephone, Time prefferedtimeslot, HealthCareProfessional hcp)
	{
		am.getAppointments().add(new Appointment(fullname, mobilephone, prefferedtimeslot, hcp ));	
	}
	
	/**
	* public void cancelBooking(String mobilephone)
	* <p>
	* Cancel any booking by removing an appointment object from the arraylist 
    * @param  mobilephone mobilephone
	*/
	
	public void cancelBooking(String mobilephone)
	{
		for(Appointment ap : am.getAppointments())
		{
			if(ap.getMobilephone().equals(mobilephone))
			{
				am.getAppointments().remove(ap);
				break;
			}
		}
				
	}
}

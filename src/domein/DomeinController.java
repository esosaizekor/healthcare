package domein;

import java.sql.Time;

import dto.AppointmentDTO;
import dto.HealthCareProfessionalDTO;

public class DomeinController {

	/**
	* DomeinController 
	* <p>
	* This is our DomeinController class with the methods 
	* getHealthCareProfessionals
	* getAppointments
	* createNewAppointment
	* cancelBooking
	*
	*/
	
	HealthCareProfessionalRepository hcr =  null;
	AppointmentRepository ar = null;

	/**
	* DomeinController()
	* <p>
	* De gebruiker meldt zich aan, werpt exceptie 
	*/
	
	public DomeinController() {
		hcr = new HealthCareProfessionalRepository();
		ar = new AppointmentRepository();
		
		// TODO Auto-generated constructor stub
	}
	
	/**
	* getHealthCareProfessionals()
	* <p>
	* Returns all healthcareprofessionals 
	*/
	
	public HealthCareProfessionalDTO getHealthCareProfessionals()
	{
		return new HealthCareProfessionalDTO(hcr.getHealthCareProfessionals());
	}

	/**
	* getAppointments()
	* <p>
	* Returns all appointments 
	*/

	public AppointmentDTO getAppointments()
	{
		return new AppointmentDTO(ar.getAppointments());
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
		ar.createNewAppointment(fullname, mobilephone, prefferedtimeslot, hcp );
	}
	
	/**
	* public void cancelBooking(String mobilephone)
	* <p>
	* Cancel any booking by removing an appointment object from the arraylist 
    * @param  mobilephone mobilephone
	*/

	public void cancelBooking(String mobilephone)
	{
		ar.cancelBooking(mobilephone);	
	}
	
}

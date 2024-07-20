package domein;

import java.sql.Time;

import dto.AppointmentDTO;
import dto.HealthCareProfessionalDTO;

public class DomeinController {

	HealthCareProfessionalRepository hcr =  null;
	AppointmentRepository ar = null;
	
	public DomeinController() {
		hcr = new HealthCareProfessionalRepository();
		ar = new AppointmentRepository();
		
		// TODO Auto-generated constructor stub
	}
	
	public HealthCareProfessionalDTO getHealthCareProfessionals()
	{
		return new HealthCareProfessionalDTO(hcr.getHealthCareProfessionals());
	}

	public AppointmentDTO getAppointments()
	{
		return new AppointmentDTO(ar.getAppointments());
	}
	
	public void createNewAppointment(String fullname, String mobilephone, Time prefferedtimeslot, HealthCareProfessional hcp)
	{
		ar.createNewAppointment(fullname, mobilephone, prefferedtimeslot, hcp );
	}
	
	public void cancelBooking(String mobilephone)
	{
		ar.cancelBooking(mobilephone);	
	}
	
}

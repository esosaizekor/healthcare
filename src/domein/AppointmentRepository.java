package domein;

import java.sql.Time;
import java.util.List;

import persistentie.AppointmentMapper;

public class AppointmentRepository {
    
	private AppointmentMapper am = null;
	public AppointmentRepository() {
		 am = new AppointmentMapper();
				 
		// TODO Auto-generated constructor stub
	}
	
	public List<Appointment> getAppointments()
	{
		return am.getAppointments();
	}
	
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
	
	public void createNewAppointment(String fullname, String mobilephone, Time prefferedtimeslot, HealthCareProfessional hcp)
	{
		am.getAppointments().add(new Appointment(fullname, mobilephone, prefferedtimeslot, hcp ));	
	}
	
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

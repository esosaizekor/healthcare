package domein;

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
}

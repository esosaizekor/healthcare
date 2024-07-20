package persistentie;

import java.sql.Time;
import java.util.List;
import java.util.ArrayList;

import domein.Appointment;
import domein.GeneralPractitioners;
import domein.Nurse;

public class AppointmentMapper {
    private List<Appointment> appointments = null;
    
	public AppointmentMapper() {
		appointments = new ArrayList<Appointment>();
		
		 appointments.add(new Appointment("Mafasa yula", "082345549056", new Time(8,0,0), new GeneralPractitioners("Joel Guoy")));
		 appointments.add(new Appointment("Mohammed yusuf", "082345549056", new Time(10,0,0), new GeneralPractitioners("Milley Bright")));
		 
		 appointments.add(new Appointment("Daniel grate", "082345549056", new Time(17,00,0), new Nurse("Tim dams")));
		 appointments.add(new Appointment("Emmy slate", "082345549056", new Time(17,00,0), new Nurse("Aya Salfa")));
		
		 
		// TODO Auto-generated constructor stub
	}
	
	public List<Appointment> getAppointments()
	{
		return appointments;
	}


}

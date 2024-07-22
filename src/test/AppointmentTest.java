package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import domein.Appointment;
import domein.GeneralPractitioners;
import domein.HealthCareProfessional;
import exceptions.BookException;


class AppointmentTest {
	Appointment ap;
	
	@BeforeEach
	void setUp() throws Exception {
	  ap = new Appointment("Esosa Izekor", "082345549056", new Time(10,0,0), new GeneralPractitioners("Milley Bright"));
	}
	
	/**
	* hasfullname(String fullname)
	* <p>
	* Test 
	* @param  fullname  fullname
	*/

	@ParameterizedTest
	@NullAndEmptySource
	@ValueSource(strings = {""," "})
	void hasFullname(String fullname) {
				
		Assertions.assertThrows(BookException.class, () -> ap.setFullname(fullname));
	}

	/**
	* hasfullname(String fullname)
	* <p>
	* Test 
	* @param  fullname  fullname
	*/

	@ParameterizedTest
	@NullAndEmptySource
	@ValueSource(strings = {""," "})
	void hasMobilephone(String mobilephone) {
				
		Assertions.assertThrows(BookException.class, () -> ap.setFullname(mobilephone));
	}
	
	/**
	* hasPrefferedTime(String prefferedtime) 
	* <p>
	* Test 
	* @param  fullname  fullname
	*/

	@ParameterizedTest
	@NullAndEmptySource
	@ValueSource(strings = {""," ","08:00:00"})
	void hasPrefferedTime(String prefferedtime) {
		
		Object prefT = prefferedtime;
		Assertions.assertThrows(BookException.class, () -> ap.setPrefferedtimeslot(prefT));
	}

	/**
	* hasPrefferedTime(String prefferedtime) 
	* <p>
	* Test 
	* @param  fullname  fullname
	*/

	@ParameterizedTest
	@NullSource
	void hasHealthCareProfessional(HealthCareProfessional hcp) {
				
		Assertions.assertThrows(BookException.class, () -> ap.setHcp(hcp));
	}
}

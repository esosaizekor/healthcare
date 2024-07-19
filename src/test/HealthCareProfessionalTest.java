package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import domein.HealthCareProfessional;

/**
* HealthCareProfessionalTest 
* <p>
* This is our healthcareprofessionaltest class with the methods 
* hasid
* hasfullname
*
*/


class HealthCareProfessionalTest {
	
	HealthCareProfessional hcp;
	
	@BeforeEach
	void setUp() throws Exception {
	  hcp = new HealthCareProfessional("Esosa Izekor");
	}

	/**
	* hasID(int id)
	* <p>
	* De gebruiker meldt zich aan, werpt exceptie 
	* @param  id  id
	*/

	@ParameterizedTest
	@ValueSource(ints = {0,-1,-201,-2022})
	void hasID(int id) {
		Assertions.assertThrows(IllegalArgumentException.class, () -> hcp.setId(id));
	}

	/**
	* hasfullname(String fullname)
	* <p>
	* De gebruiker meldt zich aan, werpt exceptie 
	* @param  fullname  fullname
	*/

	@ParameterizedTest
	@NullAndEmptySource
	@ValueSource(strings = {""," "})
	void hasFullname(String fullname) {
				
		Assertions.assertThrows(IllegalArgumentException.class, () -> hcp.setFullname(fullname));
	}

}

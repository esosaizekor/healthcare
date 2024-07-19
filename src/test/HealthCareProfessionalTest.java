package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import domein.HealthCareProfessional;

class HealthCareProfessionalTest {
	
	HealthCareProfessional hcp;
	
	@BeforeEach
	void setUp() throws Exception {
	  hcp = new HealthCareProfessional("Esosa Izekor");
	}

	@ParameterizedTest
	@ValueSource(ints = {0,-1,-201,-2022})
	void hasID(int id) {
		Assertions.assertThrows(IllegalArgumentException.class, () -> hcp.setId(id));
	}

	@ParameterizedTest
	@NullAndEmptySource
	@ValueSource(strings = {""," "})
	void hasFullname(String fullname) {
				
		Assertions.assertThrows(IllegalArgumentException.class, () -> hcp.setFullname(fullname));
	}

}

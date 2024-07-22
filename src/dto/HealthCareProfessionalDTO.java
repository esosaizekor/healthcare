package dto;

import java.util.List;

import domein.HealthCareProfessional;
/**
* HealthCareProfessionalDTO
* <p>
* This is our HealthCareProfessionalDTO(Data Transfer Object) class with a constructor
* Which we will use strictly for cui or gui app to print objects 
* 
	* <p>
	* This is the constructor  
	* @param hcp hcp
*/

public record HealthCareProfessionalDTO(List<HealthCareProfessional> hcp) {

}

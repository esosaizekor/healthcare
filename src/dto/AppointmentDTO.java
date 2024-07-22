package dto;

import java.util.List;

import domein.Appointment;
/**
* AppointmentDTO
* <p>
* This is our AppointmentDTO(Data Transfer Object) class with a constructor
* Which we will use strictly for cui or gui app to print objects 
* AppointmentDTO(List<Appointment> ap) 
	* <p>
	* This is the constructor  
	* @param ap ap
*/

public record AppointmentDTO(List<Appointment> ap) {

}

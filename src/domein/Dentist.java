package domein;

/**
* Dentist
* <p>
* This is our Dentist class with the methods 
* setFloor
* getFloor
*/

public class Dentist extends HealthCareProfessional {

	private String floor;
	
	/**
	* Dentist(String fullname)
	* <p>
	* A health care professional 
	* @param  fullname fullname
	*/

	public Dentist(String fullname) {
		super(fullname);
		this.setFloor("4");
		// TODO Auto-generated constructor stub
	}
	
	/**
	* Dentist(int id, String fullname, HealthCareProfessional docter_type) 
	* <p>
	* A health care professional 
	* @param  id id
	* @param  fullname fullname
	* @param  docter_type docter_type
	*/

	public Dentist(int id, String fullname, HealthCareProfessional docter_type) {
		super(id, fullname, docter_type);
		// TODO Auto-generated constructor stub
	}

	/**
	* Dentist(int id, String fullname, HealthCareProfessional docter_type, String floor)  
	* <p>
	* A health care professional 
	* @param  id id
	* @param  fullname fullname
	* @param  docter_type docter_type
	* @param  floor floor 
	*/

	public Dentist(int id, String fullname, HealthCareProfessional docter_type, String floor) {
		super(id, fullname, docter_type);
		this.setFloor(floor);
		// TODO Auto-generated constructor stub
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}
	
	@Override
	public String toString() {
		return super.toString() + "on floor " + this.getFloor();
	}

}

package domein;

/**
* Dietitian
* <p>
* This is our Dietitian class with the methods 
* setFloor
* getFloor
*/

public class Dietitian extends HealthCareProfessional {

	/**
	* Dietitian(String fullname)
	* <p>
	* A health care professional 
	* @param  fullname fullname
	*/


	public Dietitian(String fullname) {
		super(fullname);
		// TODO Auto-generated constructor stub
	}
	/**
	* Dietitian(int id, String fullname, HealthCareProfessional docter_type) 
	* <p>
	* A health care professional 
	* @param  id id
	* @param  fullname fullname
	* @param  docter_type docter_type
	*/
	public Dietitian(int id, String fullname, HealthCareProfessional docter_type) {
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

	public Dietitian(int id, String fullname, HealthCareProfessional docter_type,String floor) {
		super(id, fullname, docter_type);
		this.setFloor(floor);
		// TODO Auto-generated constructor stub
	}
	
	private String floor;

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getFloor() {
		return floor;
	}
	
	@Override
	public String toString() {
		return super.toString() + "on floor " + this.getFloor();
	}

}

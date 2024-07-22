package domein;
/**
* Nurse
* <p>
* This is our Nurse class with the methods 
* setFloor
* getFloor
*/
public class Nurse extends HealthCareProfessional {

	private String floor;
	/**
	* Nurse(String fullname)
	* <p>
	* A health care professional 
	* @param  fullname fullname
	*/	
	public Nurse(String fullname) {
		super(fullname);
		this.setFloor("2");
		// TODO Auto-generated constructor stub
	}
	/**
	* Nurse(int id, String fullname, HealthCareProfessional docter_type) 
	* <p>
	* A health care professional 
	* @param  id id
	* @param  fullname fullname
	* @param  docter_type docter_type
	*/
	public Nurse(int id, String fullname, HealthCareProfessional docter_type) {
		super(id, fullname, docter_type);
		// TODO Auto-generated constructor stub
	}
	/**
	* Nurse(int id, String fullname, HealthCareProfessional docter_type, String floor)  
	* <p>
	* A health care professional 
	* @param  id id
	* @param  fullname fullname
	* @param  docter_type docter_type
	* @param  floor floor 
	*/
	public Nurse(int id, String fullname, HealthCareProfessional docter_type,String floor) {
		super(id, fullname, docter_type);
		// TODO Auto-generated constructor stub
	 this.setFloor(floor);
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

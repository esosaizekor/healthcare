package domein;

/**
* Cleaner
* <p>
* This is our Cleaner class with the methods 
* setFloor
* getFloor
*/

public class Cleaner extends HealthCareProfessional {

	private String floor;
	
	/**
	* Cleaner(String fullname)
	* <p>
	* A health care professional 
	* @param  fullname fullname
	*/
	
	public Cleaner(String fullname) {
		super(fullname);
		this.setFloor("-1");
		// TODO Auto-generated constructor stub
	}

	/**
	* Cleaner(int id, String fullname, HealthCareProfessional docter_type) 
	* <p>
	* A health care professional 
	* @param  id id
	* @param  fullname fullname
	* @param  docter_type docter_type
	*/
	
	public Cleaner(int id, String fullname, HealthCareProfessional docter_type) {
		super(id, fullname, docter_type);
		// TODO Auto-generated constructor stub
	}

	/**
	* Cleaner(int id, String fullname, HealthCareProfessional docter_type,String floor)  
	* <p>
	* A health care professional 
	* @param  id id
	* @param  fullname fullname
	* @param  docter_type docter_type
	* @param  floor floor 
	*/
	
	public Cleaner(int id, String fullname, HealthCareProfessional docter_type,String floor) {
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

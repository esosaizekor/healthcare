package domein;

public class Nurse extends HealthCareProfessional {

	private String floor;
	
	public Nurse(String fullname) {
		super(fullname);
		this.setFloor("2");
		// TODO Auto-generated constructor stub
	}

	public Nurse(int id, String fullname, HealthCareProfessional docter_type) {
		super(id, fullname, docter_type);
		// TODO Auto-generated constructor stub
	}

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

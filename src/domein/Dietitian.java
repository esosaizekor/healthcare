package domein;

public class Dietitian extends HealthCareProfessional {


	public void setFloor(String floor) {
		this.floor = floor;
	}

	public Dietitian(String fullname) {
		super(fullname);
		// TODO Auto-generated constructor stub
	}

	public Dietitian(int id, String fullname, HealthCareProfessional docter_type) {
		super(id, fullname, docter_type);
		// TODO Auto-generated constructor stub
	}

	public Dietitian(int id, String fullname, HealthCareProfessional docter_type,String floor) {
		super(id, fullname, docter_type);
		this.setFloor(floor);
		// TODO Auto-generated constructor stub
	}
	
	private String floor;
	
	public String getFloor() {
		return floor;
	}
	
	@Override
	public String toString() {
		return super.toString() + "on floor " + this.getFloor();
	}

}

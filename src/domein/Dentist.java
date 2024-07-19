package domein;

public class Dentist extends HealthCareProfessional {

	private String floor;
	
	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public Dentist(String fullname) {
		super(fullname);
		this.setFloor("4");
		// TODO Auto-generated constructor stub
	}

	public Dentist(int id, String fullname, HealthCareProfessional docter_type) {
		super(id, fullname, docter_type);
		// TODO Auto-generated constructor stub
	}
	
	public Dentist(int id, String fullname, HealthCareProfessional docter_type, String floor) {
		super(id, fullname, docter_type);
		this.setFloor(floor);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return super.toString() + "on floor " + this.getFloor();
	}

}

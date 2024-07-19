package domein;

public class GeneralPractitioners extends HealthCareProfessional {

	private String floor;
	
	public GeneralPractitioners(String fullname) {
		super(fullname);
		this.setFloor("3");
		// TODO Auto-generated constructor stub
	}

	public GeneralPractitioners(int id, String fullname, HealthCareProfessional docter_type) {
		super(id, fullname, docter_type);
		// TODO Auto-generated constructor stub
	}

	public GeneralPractitioners(int id, String fullname, HealthCareProfessional docter_type, String floor) {
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

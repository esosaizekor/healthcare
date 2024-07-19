package domein;

public class Cleaner extends HealthCareProfessional {

	private String floor;
	
	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public Cleaner(String fullname) {
		super(fullname);
		this.setFloor("-1");
		// TODO Auto-generated constructor stub
	}

	public Cleaner(int id, String fullname, HealthCareProfessional docter_type) {
		super(id, fullname, docter_type);
		// TODO Auto-generated constructor stub
	}

	public Cleaner(int id, String fullname, HealthCareProfessional docter_type,String floor) {
		super(id, fullname, docter_type);
		// TODO Auto-generated constructor stub
		this.setFloor(floor);
	}

	@Override
	public String toString() {
		return super.toString() + "on floor " + this.getFloor();
	}
	
	
	
}

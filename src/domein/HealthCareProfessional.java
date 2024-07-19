package domein;


/**
* HealthCareProfessional 
* <p>
* This is our healthcareprofessional class with the methods 
* getid
* setid
* getfullname
* setfullname
* getdoctertype
* setdoctertype
*
*/

public class HealthCareProfessional {
	private int id;
	private String fullname;
	private HealthCareProfessional docter_type;
	
	// These are two more constructors for the health care professional
	/**
	* HealthCareProfessional(int id, String fullname, HealthCareProfessional docter_type)
	* <p>
	* De gebruiker meldt zich aan, werpt exceptie 
	* @param  fullname fullname
	*/
	
	public HealthCareProfessional(String fullname) {
		this.setFullname(fullname);
		// TODO Auto-generated constructor stub
	}

	/**
	* HealthCareProfessional(int id, String fullname, HealthCareProfessional docter_type)
	* <p>
	* De gebruiker meldt zich aan, werpt exceptie 
	* @param  id  id
	* @param  fullname fullname
    * @param  docter_type docter_type
	*/
	
	public HealthCareProfessional(int id, String fullname, HealthCareProfessional docter_type)
	{
		this.setId(id);
		this.setFullname(fullname);
		this.setDocter_type(docter_type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format("I am a %s with ID %d. I am a %s", this.getClass().getSimpleName(),
																this.getId(),
																this.getDocter_type().getClass().getSimpleName());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		
		if(id <= 0)
		{
			throw new IllegalArgumentException("Invalid number! Value must be greater than zero!");			
		}
		else
		{
			this.id = id;			
		}
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		
		if(fullname instanceof String)
		{
			if(fullname.isEmpty() || fullname.isBlank() || fullname.equals(null))
			{
				throw new IllegalArgumentException("Name not valid!");				
			}
			else
			{
				this.fullname = fullname;
				
			}

		}
		
		

	}

	public HealthCareProfessional getDocter_type() {
		return docter_type;
	}

	public void setDocter_type(HealthCareProfessional docter_type) {
		this.docter_type = docter_type;
	}
	
	

}


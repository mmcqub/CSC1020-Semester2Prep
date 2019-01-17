
public class Address {

	//Instance Variables
	private int bldNum;
	private String bldStreet;
	private String bldTown;
	private String bldPcode;
	private String bldCountry;
	
	//Public Constructor
	public Address(int bldNum, String bldStreet, String bldTown, String bldPcode, String bldCountry){
		
	}
	
	//Getter and Setter Methods
	public String getFullAddress() {
		return this.bldNum + " " + this.bldStreet + ", " + this.bldTown + ", " + this.bldPcode + ", " + this.bldCountry;
	}
	
	public int getBldNum() {
		return this.bldNum;
	}
	
	public String getBldStreet() {
		return this.bldStreet;
	}
	
	public String getBldTown() {
		return this.bldTown;
	}
	
	public String getBldPcode() {
		return this.bldPcode;
	}
	
	public String getBldCountry() {
		return this.bldCountry;
	}

	public void setBldNum(int bldNum) {
		this.bldNum = bldNum;
	}

	public void setBldStreet(String bldStreet) {
		this.bldStreet = bldStreet;
	}

	public void setBldTown(String bldTown) {
		this.bldTown = bldTown;
	}

	public void setBldPcode(String bldPcode) {
		this.bldPcode = bldPcode;
	}

	public void setBldCountry(String bldCountry) {
		this.bldCountry = bldCountry;
	}
	
	
	
}

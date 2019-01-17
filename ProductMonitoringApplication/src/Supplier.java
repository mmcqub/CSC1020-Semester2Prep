import java.util.ArrayList;

public class Supplier {
	
	//Instance Methods
	private int supCode;
	private String supName;
	private Address supAdress;
	private SupRegion supRegion;
	private ArrayList<Product> supProducts;
	
	//Public Constructor
	public Supplier(int supCode, String supName, Address supAdress, SupRegion supRegion, ArrayList<Product> supProducts) {
		this.supCode = supCode;
		this.supName = supName;
		this.supAdress = supAdress;
		this.supRegion = supRegion;
		this.supProducts = supProducts;
	}
	
	//Getters and Setters
	public int getSupCode() {
		return supCode;
	}

	public void setSupCode(int supCode) {
		this.supCode = supCode;
	}
	public String getSupName() {
		return supName;
	}
	public void setSupName(String supName) {
		this.supName = supName;
	}
	public Address getSupAdress() {
		return supAdress;
	}
	public void setSupAdress(Address supAdress) {
		this.supAdress = supAdress;
	}
	public SupRegion getSupRegion() {
		return supRegion;
	}
	public void setSupRegion(SupRegion supRegion) {
		this.supRegion = supRegion;
	}
	public ArrayList<Product> getSupProducts() {
		return supProducts;
	}
	public void setSupProducts(ArrayList<Product> supProducts) {
		this.supProducts = supProducts;
	}
	
	//Instance Methods
	public void printProductList() {
		
	}
	
}

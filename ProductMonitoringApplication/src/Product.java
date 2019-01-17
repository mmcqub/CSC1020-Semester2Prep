
public class Product {
	
	//Instance Variables
	private int proCode;
	private String proMake;
	private String proModel;
	private double proPrice;
	private int proQtyAvailable;
	private boolean proDiscontinued;
	
	//Public Constructor
	public Product(int proCode, String proMake, 
			String proModel, double proPrice, 
			int proQtyAvailable,boolean proDiscontinued) {
		
		this.proCode = proCode;
		this.proMake = proMake;
		this.proModel = proModel;
		this.proPrice = proPrice;
		this.proQtyAvailable = proQtyAvailable;
		this.proDiscontinued = proDiscontinued;
	}

	//Getters and Setters
	public int getProCode() {
		return proCode;
	}

	public void setProCode(int proCode) {
		this.proCode = proCode;
	}

	public String getProMake() {
		return proMake;
	}

	public void setProMake(String proMake) {
		this.proMake = proMake;
	}

	public String getProModel() {
		return proModel;
	}

	public void setProModel(String proModel) {
		this.proModel = proModel;
	}

	public double getProPrice() {
		return proPrice;
	}

	public void setProPrice(double proPrice) {
		this.proPrice = proPrice;
	}

	public int getProQtyAvailable() {
		return proQtyAvailable;
	}

	public void setProQtyAvailable(int proQtyAvailable) {
		this.proQtyAvailable = proQtyAvailable;
	}

	public boolean isProDiscontinued() {
		return proDiscontinued;
	}

	public void setProDiscontinued(boolean proDiscontinued) {
		this.proDiscontinued = proDiscontinued;
	}
	
	//Instance Methods
	public String getProductDetails() {
		return "";
	}
	
	
}
	


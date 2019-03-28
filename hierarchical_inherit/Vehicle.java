package hierarchical_inherit;

public class Vehicle {
	private String type;
	private String brand;
	
	// Constructor
	public Vehicle(String vehicleType, String vehicleBrand){
		setType(vehicleType);
		brand = vehicleBrand;
	}
	
	// setters methods
	public void setType(String newValue){
		type = newValue;
	}
	public void setBrand(String newValue){
		brand = newValue;
	}
	
	public String getType() {
		return type;
	}
	public String getBrand() {
		return brand;
	}
	// printing description
	public void printDescription(){
		System.out.println(this.getType() + " is made by " + this.brand + ". ");
	}

}

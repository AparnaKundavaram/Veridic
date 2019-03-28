package hierarchical_inherit;

public class Bike extends Vehicle {
	protected int mileage;

	public Bike(String vehicleType, String vehicleBrand, int vehicleMileage) {
		super(vehicleType, vehicleBrand);
		mileage = vehicleMileage;
	}
	public void setMileage(int newValue){
		mileage = newValue;
	}
	
	// method overriding (printDescription)
	public void printDescription(){
		System.out.println(this.getType() + " is made by " + this.getBrand() + ". " + 
				"It gives the mileage of " + this.mileage + "KMPL");
	}	
	
}

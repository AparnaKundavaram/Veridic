package hierarchical_inherit;

public class Bus extends Vehicle {
	protected String name;

	public Bus(String vehicleType, String vehicleBrand, String vehicleName) {
		super(vehicleType, vehicleBrand);
		name = vehicleName;
		// TODO Auto-generated constructor stub
	}
	
	public void setName(String newValue){
		name = newValue;
	}
	
	// method overriding (printDescription)
	public void printDescription(){
		System.out.println(this.getType() + " is made by " + this.getBrand() + ". " + 
				"It's name is " + this.name);
	}
}

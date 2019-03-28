package hierarchical_inherit;

public class Car extends Vehicle {
	protected int speed;
	
	public Car(String vehicleType, String vehicleBrand, int vehicleSpeed) {
		super(vehicleType, vehicleBrand);
		speed = vehicleSpeed;
	}
	
	public void setSpeed(int newValue){
		speed = newValue;
	}
	// printing description 
	// method overriding (printDescription)
	public void printDescription(){
		System.out.println(this.getType() + " is made by " + this.getBrand() + ". " + 
				"It's top speed is " + this.speed + "kmph");
	}
}

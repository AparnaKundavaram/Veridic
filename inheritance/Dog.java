package inheritance;

public class Dog extends Dogs {
	
	// adding one more field in this subclass
	public String gender;
	
	// creating a constructor
	public Dog(String dogBreed, String dogColor, String dogName, int dogWeight, String dogGender) {
		super(dogBreed, dogColor, dogName, dogWeight);
		gender = dogGender;
	}
	
	// creating a setter method
	public void setGender(String newValue) {
		gender = newValue;
	}
	
	// printing the decsription with the values
	public void printDescription(){
		System.out.println(this.name + " is " + this.breed + "breed " +
				"and its " + this.color + " in color " +
				"weighing about " + this.weight + "lbs " +
				"and it's gender is " + this.gender);
	}

}

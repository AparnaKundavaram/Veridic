package inheritance;

public class Dogs {
	
	protected String breed;
	protected String color;
	protected String name;
	protected int weight;
	
	// creating a constructor
	public Dogs(String dogBreed, String dogColor, String dogName, int dogWeight) {
		breed = dogBreed;
		color = dogColor;
		name = dogName;
		weight = dogWeight;
	}
	
	// creating the setters methods
	public void setBreed(String newValue) {
		breed = newValue;
	}
	
	public void setColor(String newValue) {
		color = newValue;
	}
	
	public void setName(String newValue) {
		name = newValue;
	}
	
	public void setWeight(int newValue) {
		weight = newValue;
	}
	
	// printing the values with the description
	public void printDescription(){
		System.out.println(this.name + " is " + this.breed + "breed " +
				"and its " + this.color + " in color " +
				"weighing about " + this.weight + "lbs ");
	}
	 
}

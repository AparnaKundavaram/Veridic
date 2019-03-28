package inheritance;

public class Test {
	
	public static void main(String[] args) {
		Dogs a = new Dogs("Maltese", "White", "Lucas", 7);
		a.printDescription();
		
		Dog b = new Dog("Labrador", "Brown", "Choco", 70, "Male");
		b.printDescription();
		
		Dogs c = new Dog("Pug", "Silver Fawn", "Rocky", 20, "Female");
		c.printDescription();
		
	}
}

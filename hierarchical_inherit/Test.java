package hierarchical_inherit;

public class Test {
	
	// Overloading
	public static void goal(int x)
	{
		System.out.println(x);
	}
	public static void goal(char x)
	{
		System.out.println(x);
	}
	
	public static void main(String[]args){
		Vehicle obj1 = new Car("Skoda Rapid", "Volkswagen", 180);
		obj1.printDescription();
		Vehicle obj2 = new Bus("Single deck", "Skoda", "Irisbus");
		obj2.printDescription();
		Vehicle obj3 = new Bike("Platina ComforTec", "Bajaj", 104);
		obj3.printDescription();
		goal(10);
		goal('e');
	}
													
}

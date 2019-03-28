package multilevel_inherit;

public class Mammal extends Vertebrates{
	
	public void milk(){
		System.out.println("If an animal drinks milk when it is a baby and has hair on its body, it belongs to the mammal class.");
	}
	
	public static void main(String[] args){
		Mammal obj = new Mammal();
		obj.types();
		obj.backbone();
		obj.milk();
	}
	
}


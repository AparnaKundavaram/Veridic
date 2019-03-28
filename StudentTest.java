package encapsulation;

import java.util.Scanner;

public class StudentTest {
	
	public static void main(String[]args){
		Student stud = new Student();
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the Student Name:");
		stud.setName(userInput.nextLine());
		System.out.println("Enter the Student Id Number:");
		stud.setIdNum(userInput.nextLine());
		System.out.println("Enter the Student Age:");
		stud.setAge(userInput.nextInt());
		
		System.out.println("Name of the student: " + stud.getName() + "\n" + 
		"Id Number of the student: " + stud.getIdNum() + "\n" +
				"Age of the student: " + stud.getAge() + "years");
		
		userInput.close();
	}

}

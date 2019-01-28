import java.awt.SystemColor;

public class Dog {
	static int dognum;
	static {
		newDogBorn(); ///static method which gives a message on class creation and increments dognum.
	}
	
	String name;
	String age;
	

	
	static void newDogBorn() {
		String message = "A new dog was born!";
		System.out.println(message);
		dognum += 1;
	}
	
	public Dog (String dogname) {
		name = dogname;
	}
	
	public Dog(String dogname, String dogage) { //assign name and age to an appropriate fields on an dog instance creation
		// TODO Auto-generated constructor stub
		name = dogname;
		age = dogage;
		
	}	
	public static void gav (Dog dogobj) {
		System.out.println("Dog name is "+ dogobj.name);
	}
}

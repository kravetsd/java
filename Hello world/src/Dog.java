
public class Dog {
	static String name;
	String age;
	public Dog(String dogname, String dogage) { //assign name and age to an appropriate fields on an dog instance creation
		// TODO Auto-generated constructor stub
		name = dogname;
		age = dogage;
	}	
	public static void gav () {
		System.out.println("Dog name is "+name.concat(" !!! "));
	}
}

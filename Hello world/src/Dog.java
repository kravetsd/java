
public class Dog {
	static String name;
	int age;
	public Dog(String dogname, int dogage) {
		// TODO Auto-generated constructor stub
		name = dogname;
		age = dogage;
	}	
	public static void gav () {
		System.out.println(name.concat(" !!! "));
	}
}

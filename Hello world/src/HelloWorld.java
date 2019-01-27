
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		Dog mydog = new Dog("Bill");
		mydog.gav(); //testing static method of a dog class without instance of dog object itself
		String name = "Bill";
		System.out.println(name.substring(1, 3));
	}	

}

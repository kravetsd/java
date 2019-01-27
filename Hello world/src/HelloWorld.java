
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		Dog mydog = new Dog("Bill","12");
		System.out.println(mydog.age);
		Dog.gav(); //testing static method of a dog class without instance of dog object itself
		Car mycar = new Car();
		mycar.color = "blue";
		mycar.type = "sedan";
		mycar.cardescription();
		String mycardescr = mycar.getDescr();
		System.out.println(mycardescr);
	}	

}

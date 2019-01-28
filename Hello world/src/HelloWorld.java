
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		Dog mydog = new Dog("Bill","12");
		System.out.println(mydog.age);
		Dog.gav(); //testing static method of a dog class without instance of dog object itself
		Car mycar = new Car();
		mycar.cardescription();
		int vim = mycar.getVim();
		System.out.println(vim);
		String mycardescr = mycar.getDescr();
		System.out.println(mycardescr);
		
		
		// generating a new car:
		Car newmycar = new Car();
		newmycar.cardescription();
		int vimnewmycar = newmycar.getVim();
		System.out.println(vimnewmycar);
		
		
		// call static method parkMyCar:
		Car.parkMyCar("A-24", mycar);
		
	}	

}

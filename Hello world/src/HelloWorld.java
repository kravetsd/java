public class HelloWorld {
	public static void main(String[] args) {
		Dog mydog = new Dog("Bill","12");
		System.out.println(Dog.dognum);
		Car mycar = new Car();
		mycar.cardescription();
		mydog.renameDog("Spyke");
		System.out.println(mydog.name);
		
		// call static method parkMyCar:
		Car.parkMyCar("A-24", mycar);
	}	

}

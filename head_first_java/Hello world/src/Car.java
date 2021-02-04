public class Car {
	String color = "blue"; //in line initialization
	String type;
	static int vim;
	
	//start of an initialization block
	{
		color = "green";
		type = "sedan";
		vim += 1;
	}
	 
	//clear constructor
	public Car () {
		
	} 
		
	// constructor with all fields are being described
	public Car(String cartype, String carcolor) {
		type = cartype;
		color = carcolor;
	}
	
	void cardescription() {
		System.out.println("This is a car "+type+" wth a color "+ color);
	}
	
	int getVim() {
		return vim;
	}
	
	String getDescr() {
		String descr = "This is a car "+type+" wth a color "+ color;
		return descr;
	}
	
	// implementing static method with parameters:
	static String parkMyCar(String CarPlace, Car anyCar) {
		System.out.println(anyCar.color+" " +anyCar.type + " was parked to "+ CarPlace + " place");
		return CarPlace;		
	}
}

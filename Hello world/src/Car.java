public class Car {
	String color = "blue"; //in line initialization
	String type;
	
	//start of an initialization block
	{
		color = "green";
		type = "sedan";
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
	String getDescr() {
		String descr = "This is a car "+type+" wth a color "+ color;
		return descr;
	}
}

public class Car {
	String color;
	String type;
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

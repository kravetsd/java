package get_set;

class cat {
	static int catCount;    
	int age;
	int weight;
	int height;
	private String name;
	static {
		
	}
	cat(String name){
		catCount += 1;
		System.out.println(name+"1");
		System.out.println(this.name);
		this.name = name;

	}
	void RenameCat(String name) {
		this.name = name; 
	}
	
	String CallCat() {
		return this.name;
	}
}
 
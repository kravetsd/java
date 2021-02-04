package get_set;

public class get_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat mycat = new cat("noname");
		System.out.println(mycat.height);
		System.out.println(mycat.CallCat() + " <---- this name was given by instance initiating via constructor");
		System.out.println(cat.catCount+" catCount value");
		mycat.RenameCat("Musia");
		System.out.println(mycat.CallCat() + " name after renaming.");
		
		
	}

}

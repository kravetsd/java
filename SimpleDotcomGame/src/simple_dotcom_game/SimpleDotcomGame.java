package simple_dotcom_game;
import java.util.Scanner;

public class SimpleDotcomGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] locs = {2,5,7};
		String usergues = "5";
		SimpleDotcom dotcom = new SimpleDotcom();
		dotcom.setLocationcells(locs);
		String result = dotcom.checkYourself(usergues);
		String testReuslt = "Failed!";
		if (result.equals("HIT!")) {
			testReuslt = "Passed!";
			
		}
		System.out.println(testReuslt);
		
	}

}

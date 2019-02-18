package simple_dotcom_game;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SimpleDotcomGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfGuess = 0;
		boolean kill = false;
		
		int rn = ThreadLocalRandom.current().nextInt(0, 3 + 1); //generating a random number
		int [] locs = {rn,rn+1,rn+2}; // computing a cellslocation as a three consecutive number.
		SimpleDotcom dotcom = new SimpleDotcom();
		dotcom.setLocationcells(locs);
		while (kill == false) {
			Scanner reader = new Scanner(System.in);  // Reading from System.in
			System.out.println("Enter a gues: ");
			String usergues = reader.nextLine();  // Read user input.
			//once finished
			if (Integer.parseInt(usergues) >=8) {
				System.out.println("Please enter a digit in range of 1 to 7");
				continue;
			}			
			String result = dotcom.checkYourself(usergues);
			String testReuslt = "Failed!";
			System.out.println(result);
			
			if (result.equals("KILL!")) {
				kill = true;
				reader.close();
			}
			numOfGuess += 1;
			System.out.println(numOfGuess);
		}
		System.out.println("kill! "+ "you took "+ numOfGuess+ " guesses!");
	}

}

package simple_dotcom_game;

public class SimpleDotcom {
	int [] locationcells;
	int numofhit = 0;
	
	void setLocationcells(int [] loc) {
		locationcells = loc;
	}
	String checkYourself(String gues) {
		int num = Integer.parseInt(gues);
		for (int cell : locationcells) {
			if (cell==num) {				
				if (numofhit == locationcells.length) {
					return "KILL!";
				}
				numofhit++;
				return "HIT!";
			}
		}
		numofhit++;
		return "MISS";
	}
	

}

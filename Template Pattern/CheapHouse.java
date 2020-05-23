import java.io.*;
//cheap house building process
public class CheapHouse extends BuildingHouse {
 
	@Override
	void walls() { //primitive operation 
		System.out.println("Building walls for cheap house using paper materials.");
		
	}
	
	@Override
	void roof() { //primitive operation 
		System.out.println("Building roof using WikiHowTo page guidlines."); //yes the page actually exists
		
	}

	@Override
	void addMaterial() { //primitive operation 
		System.out.println("Adding wood materials for extra security and wooden door. Not that it will help somehow...");
		
	}
 
	public boolean extraSecurity() { //self explaining

		String answer = getUserInput();

		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			System.out.println("It wouldn't help either way, still no one wants to rob such house haha");
			return false;
		}
	}
 
	private String getUserInput() { //input
		String answer = null;

		System.out.print("Would you like wood materials added to your house for extra security including an actual door not blinders (y/n)? ");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException ioe) {
			System.err.println("IO error trying to read your answer");
		}
		if (answer == null) {
			return "no";
		}
		return answer;
	}


}
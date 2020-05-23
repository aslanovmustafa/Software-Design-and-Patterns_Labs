import java.io.*;
//here we have an expensive house building process
public class ExpensiveHouse extends BuildingHouse {
 
	@Override
	void walls() { //primitive operation 
		System.out.println("Building walls for expensive house using stone materials.");
		
	}

	@Override
	void addMaterial() { //primitive operation 
		System.out.println("Adding steal materials for extra security and safe door. Now no one can get into the house...even the owners.");
		
	}
	
	@Override
	void roof() { //primitive operation 
		System.out.println("Building roof using guidlines of indian dudes' channel on YouTube."); //yes those exact indians
		
	}

 
	public boolean extraSecurity() { //self explaining

		String answer = getUserInput();

		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			System.out.println("Enjoy your house getting robbed.");
			return false;
		}
	}
 
	private String getUserInput() { //just the input
		String answer = null;

		System.out.print("Would you like steal materials added to your house for extra security, including safe door (y/n)? ");

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

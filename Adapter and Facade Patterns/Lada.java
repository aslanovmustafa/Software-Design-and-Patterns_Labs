//this one represents the old gen type of a car (reference would be Mallard duck implementing Duck)
public class Lada implements OldGenCar{

	@Override
	public void keyToStartEngine() {
		System.out.println("Insert the keys to start the engine.");
		
	}

	@Override
	public void startMusicOnCD() {
		System.out.println("Insert the CD to start music.");
		
	}

	@Override
	public void rollDownWindows() {
		System.out.println("Roll down the windows if you want some fresh air full of pollution.");
		
	}

	@Override
	public void openDoorsUsingHandle() {
		System.out.println("Turn the handle up to open the door.");
		
	}

	@Override
	public void turnLightsOn() {
		System.out.println("Flick the switch to turn the lights on.");
		
	}

	

	@Override
	public void keyTostopEngine() {
		System.out.println("Remove the keys to stop the engine.");
		
	}

	@Override
	public void stopMusicOnCD() {
		System.out.println("Remove the CD to stop music.");
		
	}

	@Override
	public void rollUpWindows() {
		System.out.println("Roll up the windows if you want no air.");
		
	}

	@Override
	public void closeDoorBySlamming() {
		System.out.println("Slam the door to close it.");
		
	}

	@Override
	public void turnLightsOff() {
		System.out.println("Flick the switch to turn the lights off.");
		
	}

	

}

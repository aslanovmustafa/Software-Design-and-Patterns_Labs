//Tesla represents new gen car
public class Tesla implements NewGenCar{

	@Override
	public void startEngineButton() {
		System.out.println("Press the button to start the engine");
		
	}

	@Override
	public void startMusicBluetooth() {
		System.out.println("Bluetooth is turned on and automatically will connect to your phone.");
		
	}

	@Override
	public void openWindowsButton() {
		 System.out.println("Press the down button if you wanna open windows");
		
	}

	@Override
	public void openDoorButton() {
		System.out.println("Slightly tap and door handle if you want it to open");
		
	}

	@Override
	public void turnLightsOn() {
		System.out.println("Lights will automatically turn on if sensors detect dimming");
		
	}

	@Override
	public void turnACon() {
		System.out.println("Press the button to turn on the AC and select the preferred temperature");
		
	}

	@Override
	public void stopEngineButton() {
		System.out.println("To stop engine press the engine button");
		
	}

	@Override
	public void stopMusicBluetooth() {
		System.out.println("Bluetooth is being is disconnected");
		
	}

	@Override
	public void closeWindowsButton() {
		System.out.println("Press up button to close the windows or they will automatically close after you close the doors.");
		
	}

	@Override
	public void closeDoorButton() {
		System.out.println("Slightly tap on door handle to close the door.");
		
	}

	@Override
	public void turnLightsOff() {
		System.out.println("Turn off the ligths or they will automatically turn off if engine is turned off.");
		
	}

	@Override
	public void turnACoff() {
		System.out.println("Press button to turn off AC.");
		
	}

}

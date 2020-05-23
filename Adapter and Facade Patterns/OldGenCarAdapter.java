
public class OldGenCarAdapter implements NewGenCar{
	OldGenCar ogc;
	
	public OldGenCarAdapter(OldGenCar ogc) {
		this.ogc=ogc;
	}
	
	@Override
	public void startEngineButton() {
		ogc.keyToStartEngine();
		
	}

	@Override
	public void startMusicBluetooth() {
		ogc.startMusicOnCD();
		
	}

	@Override
	public void openWindowsButton() {
		ogc.rollDownWindows();
		
	}

	@Override
	public void openDoorButton() {
		ogc.openDoorsUsingHandle();
		
	}

	@Override
	public void turnLightsOn() {
		ogc.turnLightsOn();
		
	}

	
	@Override
	public void stopEngineButton() {
		ogc.keyTostopEngine();
		
	}

	@Override
	public void stopMusicBluetooth() {
		ogc.stopMusicOnCD();
		
	}

	@Override
	public void closeWindowsButton() {
		ogc.rollUpWindows();
		
	}

	@Override
	public void closeDoorButton() {
		ogc.closeDoorBySlamming();
		
	}

	@Override
	public void turnLightsOff() {
		ogc.turnLightsOff();
		
	}

	@Override
	public void turnACon() {
		System.out.println("Sorry no AC found");
		
	}

	@Override
	public void turnACoff() {
		System.out.println("Sorry no AC found");
		
	}


}

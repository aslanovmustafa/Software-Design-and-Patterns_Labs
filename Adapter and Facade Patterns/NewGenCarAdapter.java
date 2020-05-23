
public class NewGenCarAdapter implements OldGenCar {
	NewGenCar ngc;
	
	public NewGenCarAdapter(NewGenCar ngc) {
		this.ngc=ngc;
	}

	@Override
	public void keyToStartEngine() {
		ngc.startEngineButton();

	}

	@Override
	public void startMusicOnCD() {
		ngc.startMusicBluetooth();
	}

	@Override
	public void rollDownWindows() {
		ngc.openWindowsButton();

	}

	@Override
	public void openDoorsUsingHandle() {
		ngc.openDoorButton();

	}

	@Override
	public void turnLightsOn() {
		ngc.turnLightsOn();

	}

	@Override
	public void keyTostopEngine() {
		ngc.stopEngineButton();

	}

	@Override
	public void stopMusicOnCD() {
		ngc.stopMusicBluetooth();

	}

	@Override
	public void rollUpWindows() {
		ngc.closeWindowsButton();

	}

	@Override
	public void closeDoorBySlamming() {
		ngc.closeDoorButton();

	}

	@Override
	public void turnLightsOff() {
		ngc.turnLightsOff();

	}

}

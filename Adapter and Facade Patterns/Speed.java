
public class Speed {
	
	public Speed() {}

	public void limitOn() {
		System.out.println("The limit is turned on for your safety.");
	}
	
	public void limitOff() {
		System.out.println("The limit is turned off but be careful.");
	}
	
	public void limit(int speed) {
		System.out.println("The speed is limited to " + speed + " km/h.");
	}
}


public class Music {
	public Music() {}
	public void on() {
		System.out.println("Music is turned on.");
	}
	
	public void off() {
		System.out.println("Music is turned off.");
	}
	
	public void mode(String mood) {
		System.out.println("According to weather " + mood + " music is playing.");
	}
	
	public void play(String name) {
		System.out.println("Now playing \"" + name + "\"");
	}

}

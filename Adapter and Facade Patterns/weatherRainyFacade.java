//if the weather is rainy software configures parameters itself
public class weatherRainyFacade{
	
	Engine engine;
	Door door;
	Window window;
	Music music;
	AC ac;
	Speed speed;
	Lights lights;
	
	public weatherRainyFacade(	Engine engine,
								Door door,
								Window window,
								Music music,
								AC ac,
								Speed speed,
								Lights lights) {
		
		this.engine = engine;
		this.door = door;
		this.window = window;
		this.music = music;
		this.ac = ac;
		this.speed = speed;
		this.lights = lights;		
	}
						
	public void startRide() {
		System.out.println("Weather is rainy! So let's plan a ride accordingly.");
		door.open();
		engine.on();
		window.close();
		music.on();
		music.mode("moody");
		music.play("Nightcall by Kavinsky");
		ac.on();
		ac.temp(30);
		lights.on();
		lights.mode("low beam headlights");
		speed.limitOn();
		speed.limit(60);
		System.out.println("Enjoy your ride! Be careful not to slip.\n");
	}
	
	public void stopRide() {
		System.out.println("We are stopping now.");
		speed.limit(0);
		lights.off();
		music.off();
		ac.off();
		engine.off();
		door.close();
		System.out.println("Have a good day.\n");
	}
	
	
}

//if the weather is sunny the software configures parameters itself
public class weatherSunnyFacade {
	
	Engine engine;
	Door door;
	Window window;
	Music music;
	AC ac;
	Speed speed;
	Lights lights;
	
	public weatherSunnyFacade(	Engine engine,
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
		System.out.println("Weather is sunny! So let's plan a ride accordingly.");
		door.open();
		engine.on();
		window.open();
		music.on();
		music.mode("energizing");
		music.play("Is Everybody Going Crazy by Nothing But Thieves");
		ac.off();
		lights.on();
		lights.mode("daytime running");
		speed.limit(90);
		System.out.println("Enjoy your ride!\n");
	}
	
	public void stopRide() {
		System.out.println("We are stopping now.");
		speed.limit(0);
		lights.off();
		music.off();
		window.close();
		engine.off();
		door.close();
		System.out.println("Have a good day.\n");
	}
	
	
}

//I am fairly certain this could be more functional and more logical to use but my imagination is not the best. I can't think of something more
public class Main {
	public static void main(String[] args) {
		
	
	Engine engine = new Engine();
	Door door = new Door();
	Window window = new Window();
	Music music = new Music();
	AC ac = new AC();
	Speed speed = new Speed();
	Lights lights = new Lights();
	
	weatherSunnyFacade sunny = new weatherSunnyFacade(engine, door, window, music, ac, speed, lights);
	sunny.startRide();
	System.out.println("Woah, we're half way there\n" + //just as a pause in between start and stop 
						"Woah, livin' on a prayer\n");
	sunny.stopRide();
	
	
	weatherRainyFacade rainy = new weatherRainyFacade(engine, door, window, music, ac, speed, lights);
	rainy.startRide();
	System.out.println("Woah, we're half way there\n" + 
						"Woah, livin' on a prayer\n"); //just as a pause in between start and stop 
	rainy.stopRide();
	
	
	OldGenCar ogc = new Lada();
	NewGenCar ngc = new Tesla();
	NewGenCar retro = new OldGenCarAdapter(ogc); //basically new gen car with old gen interface making it look retro'ish.
	testAdapterNGC(retro);
	System.out.println("\n");
	OldGenCar futuristic = new NewGenCarAdapter(ngc); //or old gen car with futuristic new gen look but old functionalities 
	testAdapterOGC(futuristic);
	
	
	
	}
	static void testAdapterNGC(NewGenCar ngc) {
		ngc.startEngineButton();
	}
	
	static void testAdapterOGC(OldGenCar ogc) {
		ogc.keyToStartEngine();
	}
}
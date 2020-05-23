import java.util.ArrayList;

public abstract class IceCream {
	String name;
	String blending;
	String mainIngredient;
	ArrayList decoration = new ArrayList();
 
	void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Mixing the ingredients...");
		System.out.println("Freezing textures as if it's gonna take a minute! ");
		System.out.println("Decorating with: ");
		for (int i = 0; i < decoration.size(); i++) {
			System.out.println("   " + decoration.get(i));
		}
	}
  
	void blend() {
		System.out.println("Blending so it's smooth!");
	}
 
	void cup() {
		System.out.println("Putting the ice cream in a cup so you don't eat it with hands and freeze!");
	}
  
 
	public String getName() {
		return name;
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(blending + "\n");
		display.append(mainIngredient + "\n");
		for (int i = 0; i < decoration.size(); i++) {
			display.append((String )decoration.get(i) + "\n");
		}
		return display.toString();
	}
}

 
 

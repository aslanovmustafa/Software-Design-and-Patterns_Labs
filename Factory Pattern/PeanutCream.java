public class PeanutCream extends IceCream {

	public PeanutCream() { 
		name = "Peanut Ice Cream";
		blending = "Peanut Butter";
		mainIngredient = "Deez Nuts";
 
		decoration.add("Someone said more nutz?");
		decoration.add("Hey look! More nutz");
		decoration.add("Butter.");
	}
 
	void cup() {
		System.out.println("Putting the Ice Cream into peanut shaped cups!");
	}
}

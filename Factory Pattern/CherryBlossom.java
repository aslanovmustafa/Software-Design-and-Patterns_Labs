public class CherryBlossom extends IceCream {

	public CherryBlossom() { 
		name = "Cherry Blossom Ice Cream";
		blending = "Some flower blossom";
		mainIngredient = "Cherry";
 
		decoration.add("Cherry on top");
	}
 
	void cup() {
		System.out.println("Putting the Ice Cream into cherry shaped cups!");
	}
}

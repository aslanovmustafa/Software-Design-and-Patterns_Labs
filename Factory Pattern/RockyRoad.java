public class RockyRoad extends IceCream {

	public RockyRoad() { 
		name = "Rocky Road Ice Cream";
		blending = "Pure Cement";
		mainIngredient = "Pebbles";
 
		decoration.add("Some more rocks!");
	}
 
	void cup() {
		System.out.println("Putting the Ice Cream into brick shaped cups!");
	}
}

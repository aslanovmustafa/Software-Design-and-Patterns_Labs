public class CookieDough extends IceCream {

	public CookieDough() { 
		name = "Cookie Dough Ice Cream";
		blending = "Dough";
		mainIngredient = "Oreos";
 
		decoration.add("WE LIKE COOKIES so here's some.");
	}
 
	void cup() {
		System.out.println("Putting the Ice Cream into cookie shaped cups!");
	}
}

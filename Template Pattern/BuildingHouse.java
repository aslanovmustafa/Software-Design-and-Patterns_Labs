public abstract class BuildingHouse {

	
	void build() { // the template method of the building home project which combines the basic needs to build a house. therefore putting it in
					// the template would make sense
		prepareBasement();
		walls();
		doors();
		roof();
		paint();
		if (extraSecurity()) {
			addMaterial();
		}
	}

	abstract void walls();
	abstract void addMaterial();
	abstract void roof(); //initially thought to make it non-abstract but then realized probably cheap and expensive house's roofs are not the same

	void prepareBasement() {
		System.out.println("Preparing the basement of the house."); //self explaining
	}
	void doors() {
		System.out.println("Adding doors.");//self explaining
	}

	void paint() {
		System.out.println("Finalizing the home by painting it in some rainbow colours."); //same painting for both to compensate poor job quality of the company
	}

	boolean extraSecurity() { //depending on input of user will change
		return true;
	}
}
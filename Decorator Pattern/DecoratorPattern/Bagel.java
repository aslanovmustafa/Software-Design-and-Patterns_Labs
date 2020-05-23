package DecoratorPattern;

public class Bagel extends Pizza {
	public Bagel() {
		description = "Pizza Bagel";
	}

	@Override
	public double getCost() {
		return 8.00;
	}



}

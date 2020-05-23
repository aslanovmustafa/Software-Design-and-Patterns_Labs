package DecoratorPattern;

public class Maltese extends Pizza {
	public Maltese() {
		description = "Pizza Maltese";
	}

	@Override
	public double getCost() {
		return 18.00;
	}



}

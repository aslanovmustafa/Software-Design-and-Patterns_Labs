package DecoratorPattern;

public class Neapolitan extends Pizza {
	public Neapolitan() {
		description = "Pizza Neapolitan";
	}

	@Override
	public double getCost() {
		return 12.00;
	}



}

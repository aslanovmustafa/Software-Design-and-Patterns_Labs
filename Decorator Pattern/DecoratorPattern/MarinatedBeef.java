package DecoratorPattern;

public class MarinatedBeef extends PizzaTopping {
	Pizza pizzaType;

	public MarinatedBeef(Pizza type) {
		this.pizzaType = type;
	}

	@Override
	public String getDescription() {

		return pizzaType.getDescription() + ", Marinated Beef ";
	}

	@Override
	public double getCost() {

		return 5.00 + pizzaType.getCost();
	}



}

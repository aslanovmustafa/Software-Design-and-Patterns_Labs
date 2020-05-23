package DecoratorPattern;

public class RedOnions extends PizzaTopping {
	Pizza pizzaType;

	public RedOnions(Pizza type) {
		this.pizzaType = type;
	}

	@Override
	public String getDescription() {

		return pizzaType.getDescription() + ", Wonderful Red Onions ";
	}

	@Override
	public double getCost() {

		return 25.00 + pizzaType.getCost();
	}



}

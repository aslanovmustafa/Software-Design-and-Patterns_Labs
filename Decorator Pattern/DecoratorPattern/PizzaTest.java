package DecoratorPattern;

public class PizzaTest {
	public static void main(String[] args) {
		Pizza pizza = new Maltese();
		System.out.println(pizza.getDescription() + " " + pizza.getCost() + "₼");
		pizza = new RomaTomatoes(pizza);
		pizza = new RedOnions(pizza);
		System.out.println(pizza.getDescription() + " " + pizza.getCost() + "₼");

	}

}

public abstract class IceCreamStore {
 
	abstract IceCream createIC(String item);
 
	public IceCream orderIC(String type) {
		IceCream iceCream = createIC(type);
		System.out.println("--- Making a " + iceCream.getName() + " ---");
		iceCream.prepare();
		iceCream.blend();
		iceCream.cup();
		return iceCream;
	}
}

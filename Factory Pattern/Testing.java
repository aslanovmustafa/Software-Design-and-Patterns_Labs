public class Testing {
 
	public static void main(String[] args) {
		IceCreamStore someStore = new SomeFranchise();
		 
		IceCream iceCream = someStore.orderIC("nuts");
		System.out.println("\nMichael ordered " + iceCream.getName() + "\n");
 
	}
}

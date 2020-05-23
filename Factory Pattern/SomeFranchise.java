public class SomeFranchise extends IceCreamStore {

	IceCream createIC(String item) {
    if (item.equals("rocks")) {
      return new RockyRoad();
    } else if (item.equals("nuts")) {
      return new PeanutCream();
    } else if (item.equals("cookie")) {
      return new CookieDough();
    } else if (item.equals("cherry")) {
      return new CherryBlossom();
    } else {
      return null;
    }
	}
}

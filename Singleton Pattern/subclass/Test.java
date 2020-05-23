public class Test {
  
  public static void main(String[] args) {
	  SecretFiles_subclass bestAgent = BestAgent.getAccess();
	  SecretFiles_subclass worstAgent = WorstAgent.getAccess();
	  bestAgent.getFiles();
      worstAgent.getFiles();
  }
}

// 'bestAgent' and 'worstAgent' are the same object here and will print the same output
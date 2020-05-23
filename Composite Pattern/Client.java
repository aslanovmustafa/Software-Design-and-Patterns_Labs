import java.util.Iterator;

public class Client {
  Component allAccounts;
  double balanceAll;
  
  public Client(Component allAccounts) {
    this.allAccounts = allAccounts;
  }
  
  public void printAccounts() {
	  allAccounts.print();
  }
  
  public void getBalance() {
	  Iterator<?> iterator = allAccounts.createIterator();
	  System.out.println("\n\nTOTAL OF ALL ACCOUNTS\n"
			  + "---------------------------------");
	    while (iterator.hasNext()) {
	      Component component = (Component)iterator.next();
	      try {
	      balanceAll += component.getBalance();}
	      catch(UnsupportedOperationException e) {}
	    }
	    System.out.println("Total balance for all accounts is $" + balanceAll);
	  }
  }

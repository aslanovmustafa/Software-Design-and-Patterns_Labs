public class TestDrive {
  
  public static void main(String args[]) {
    Component Deposit = new Account("DEPOSIT ACCOUNT", "here are your deposit money");
    Component Savings = new Account("SAVINGS ACCOUNT", "here are your savings money");
    
    Component allAccounts = new Account("ALL ACCOUNTS", "all accounts combined");
    
    allAccounts.add(Deposit);
    allAccounts.add(Savings);

    
		Deposit.add(new AccountItem(
			"Current account deposits",
			159.55));
		Deposit.add(new AccountItem(
				"Recurring deposits",
				250.00));
		Deposit.add(new AccountItem(
				"Fixed deposits",
				17.59));
		

		Savings.add(new AccountItem(
				"Basic savings",
				356.65));
		Savings.add(new AccountItem(
				"Online savings",
				100000.00));
		Savings.add(new AccountItem(
				"Money market savings",
				1.00));
   
 
		Client client = new Client(allAccounts);
   
		client.printAccounts();
		client.getBalance();
  }
}
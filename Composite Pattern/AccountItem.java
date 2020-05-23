public class AccountItem extends Component {
  String name;
  double balance;
  
  public AccountItem(String name,
                  double balance) {
    this.name = name;
    this.balance = balance;
  }
  
  public String getName() {
    return name;
  }
  
  public double getBalance() {
    return balance;
  }
  
  public void print() {
    System.out.print("  " + getName());
    System.out.println(", " +  "$" + getBalance());
  }
}
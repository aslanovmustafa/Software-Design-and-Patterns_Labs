import java.util.Iterator;
import java.util.ArrayList;

public class Account extends Component {
  Iterator iterator = null;
  ArrayList components = new ArrayList();
  String name;
  String description;
  double balanceAll;
  
  public Account(String name, String description) {
    this.name = name;
    this.description = description;
  }
  
  public void add(Component component) {
    components.add(component);
  }
  
  public void remove(Component component) {
    components.remove(component);
  }
  
  public Component getChild(int i) {
    return (Component)components.get(i);
  }
  
  public Iterator createIterator() {
	    if (iterator == null) {
	      iterator = new CompositeIterator(components.iterator());
	    }
	    return iterator;
	  }
  
  public String getName() {
	    return name;
	  }
	  
	  public String getDescription() {
	    return description;
	  }
	  
  public void print() {
    System.out.println("\n" + getName());
    System.out.println("[" + getDescription() + "]");
    System.out.println("-------------------------------------");
    
    Iterator iterator = components.iterator();
    while (iterator.hasNext()) {
      Component component = (Component)iterator.next();
      component.print();
    }
 }

}
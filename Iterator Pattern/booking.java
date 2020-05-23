import java.util.Iterator;
import java.util.Map;

public class booking {
  Hotel jojo;
  Hotel hell;
  
  public booking(Hotel jojo, Hotel hell) {
    this.jojo = jojo;
    this.hell = hell;
  }
  
  public void printRoomsList() {
    Iterator<?> jojoIterator = jojo.createIterator();
    Iterator<?> hellIterator = hell.createIterator();
    System.out.println("ROOMS LIST\n-----------\n\nJOJO HOTEL\n-----------\n\n");
    printRoomsList(jojoIterator);
    System.out.println("\nHELL HOTEL\n-----------\n\n");
    printRoomsList(hellIterator);
  }
  
  private void printRoomsList(Iterator iterator) {
    while (iterator.hasNext()) {
      RoomItem room = (RoomItem)iterator.next();
      System.out.println("ID: " +room.getID() + ", ");
      System.out.println("Type: " +room.getType() + ", ");
      System.out.println(room.getRoomNumbers() + " room(s), ");
      System.out.println(room.getPrice() + "$ per night.\n");

      
    }
    
  }
  
}
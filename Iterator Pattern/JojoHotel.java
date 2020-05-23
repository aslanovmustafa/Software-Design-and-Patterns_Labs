import java.util.*;
import java.util.Iterator;

public class JojoHotel implements Hotel {
  List rooms;
  
  public JojoHotel() {
    rooms = new ArrayList<RoomItem>();
    
    addRoom("F1R1", 
    		1,
			"Single", 
			99);
 
		addRoom("F1R2", 
	    		2,
				"Double", 
				159);
 
		addRoom("F2R1", 
	    		4,
				"Quad", 
				299);
 
		addRoom("F2R2", 
	    		5,
				"Queen", 
				399);
  }
  
  public void addRoom(String ID, int roomNumber, String type, int price) {
    RoomItem room = new RoomItem(ID, roomNumber, type, price);
    rooms.add(room);
  }
  
  public List getRoomItems() {
    return rooms;
  }
  
  public Iterator createIterator() {
   // return new JojoHotelIterator(rooms); doesn't work when HashMap uses Java's Iterator ¯\_(ツ)_/¯
	  return rooms.iterator();
  }
}
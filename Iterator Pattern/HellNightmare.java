import java.util.*;
import java.util.Iterator;

public class HellNightmare implements Hotel {
  HashMap rooms = new HashMap();
  
  public HellNightmare() {
	   addRoom("F1R1", 
	    		5,
				"Queen", 
				399);
	 
			addRoom("F1R2", 
		    		6,
					"King", 
					499);
	 
			addRoom("F2R1", 
		    		10,
					"Studio", 
					999);
	 
			addRoom("F2R2", 
		    		15,
					"Mini Hotel", 
					1399);
	  }
 
  public void addRoom(String ID, int roomNumber, String type, int price) 
	{
	  RoomItem room = new RoomItem(ID, roomNumber, type, price);
		rooms.put(room.getID(), room);
	}
 
	public Iterator createIterator() {
		return rooms.values().iterator();

  }
}
import java.util.*;
import java.util.Map.Entry;

public class HellNightmareIterator implements Iterator, java.util.Iterator{
	HashMap<String, RoomItem> rooms;
	java.util.Iterator<Entry<String, RoomItem>> hmIterator = rooms.entrySet().iterator();
	
	public HellNightmareIterator(HashMap<String, RoomItem> rooms) {
	    this.rooms = rooms;
	  }
	
	
	
	@Override
	public boolean hasNext() {
		return hmIterator.hasNext();
	}

	@Override
	public Object next() {
		return hmIterator.next();
	}

	  public void book() {
		    hmIterator.remove();
		  }
}



import java.util.ArrayList;
import java.util.List;

public class JojoHotelIterator implements Iterator {
  List rooms;
  int position = 0;
  
  public JojoHotelIterator(List rooms) {
    this.rooms = rooms;
  }
  
  public Object next() {
    RoomItem room = (RoomItem) rooms.get(position);
    position = position + 1;
    return room;
  }
  
  public boolean hasNext() {
    if (position >= rooms.size() || rooms.get(position) == null) {
      return false;
    } 
    else {
      return true;
    }
  }
  
  public void book() {
    if (position <= 0) {
      throw new IllegalStateException("You can't book a room until you've one at least one next()");
    }
    if (rooms.get(position-1) != null) {
      for (int i = position - 1; i < (rooms.size() - 1); i++) {
        rooms.set(i, rooms.get(i + 1));
      }
      rooms.set(rooms.size() -1, null);
    }
  }
}
import java.util.*;

public class Test {
  
  public static void main(String[] args) {
    JojoHotel jojo = new JojoHotel();
    HellNightmare hell = new HellNightmare();
    
    booking book = new booking(jojo, hell);
    book.printRoomsList();
  }
}
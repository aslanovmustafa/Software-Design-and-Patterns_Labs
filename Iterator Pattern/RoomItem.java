public class RoomItem {
  String ID;
  int roomNumber;
  String type;
  int price;
  
  public RoomItem(String ID,
		  			int roomNumber,
		  			String type,
		  			int price) {
    this.ID = ID;
    this.roomNumber = roomNumber;
    this.type = type;
    this.price = price;
  }
  
  public String getID() {
    return ID;
  }
  
  public int getRoomNumbers() {
    return roomNumber;
  }
  
  public String getType() {
    return type;
  }
  
  public int getPrice() {
    return price;
  }
}
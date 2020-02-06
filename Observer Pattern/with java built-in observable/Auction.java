import java.util.Observable;
import java.util.Observer;

public class Auction implements Observer, DisplayElement {
 Observable observable;
 private String sAuthor;
 private float price;
 private String sName;

 public Auction(Observable observable) {
 this.observable = observable;
 observable.addObserver(this);
 }

 public void update(Observable obs, Object arg) {
 if (obs instanceof BidData) {
 BidData BidData = (BidData)obs;
 this.sAuthor = BidData.getsAuthor();
 this.price = BidData.getprice();
 this.sName	= BidData.getsName();
 display();
 }
 }

 public void display() {
	 System.out.println("Current auction: " + "\nBidder name: " + sAuthor + "\nPrice: " + price + "\nSlot name: " + sName +"\n");
	 }
}
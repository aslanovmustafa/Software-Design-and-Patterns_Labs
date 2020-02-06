package lab2;
import java.util.*;

public class Auction implements Bidder, DisplayElement {
	private String sAuthor;
	private float price;
	private String sName;
	private Auctioneer bidData;

	 public Auction(Auctioneer bidData) {
	 this.bidData = bidData;
	 bidData.registerBidder(this);
	 }

	 public void update (String sAuthor, float price, String sName) {
			 this.sAuthor = sAuthor;
			 this.price = price;
			 this.sName = sName;
	 display();
	 }

	 public void display() {
	 System.out.println("Current auction: " + "\nBidder name: " + sAuthor + "\nPrice: " + price + "\nSlot name: " + sName +"\n");
	 }
}
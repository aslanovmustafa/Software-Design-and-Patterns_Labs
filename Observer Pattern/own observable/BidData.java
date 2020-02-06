package lab2;
import java.util.*;

public class BidData implements Auctioneer {
	private ArrayList observers;
	private String sAuthor;
	private float price;
	private String sName;

		public BidData() {
			observers = new ArrayList();
		}
		
		public void priceChanged() {
			notifyBidders();
		}
		
		public void registerBidder(Bidder o) {
			 observers.add(o);
			 }
		
		public void removeBidder(Bidder o) {
			 int i = observers.indexOf(o);
			 if (i >= 0) {
			 observers.remove(i);
			 }
		 }
		
		public void notifyBidders() {
			 for (int i = 0; i < observers.size(); i++) {
			 Bidder observer = (Bidder)observers.get(i);
			 observer.update(sAuthor, price, sName);
			 }
		 }
		
		public void setInfo(String sAuthor, float price, String sName) {
			 this.sAuthor = sAuthor;
			 this.price = price;
			 this.sName = sName;
			 priceChanged();
		}
}

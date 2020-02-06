package lab2;

public interface Auctioneer {
	 public void registerBidder(Bidder o);
	 public void removeBidder(Bidder o);
	 public void notifyBidders();
}

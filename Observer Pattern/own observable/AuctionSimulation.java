package lab2;

public class AuctionSimulation {
	public static void main(String[] args) {
		 BidData bidData = new BidData();

		 Auction auction = new Auction(bidData);
		 bidData.setInfo("Mister Pinky", 53, "Slot 53" );
		 bidData.setInfo("Mister Joe Mama", 420, "Slot 69" );
		 }
	}


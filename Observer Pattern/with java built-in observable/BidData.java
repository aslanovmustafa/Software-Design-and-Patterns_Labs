import java.util.Observable;
import java.util.Observer;

public class BidData extends Observable {
 private String sAuthor;
 private float price;
 private String sName;

 public BidData() { }

 public void priceChanged() {
 setChanged();
 notifyObservers();
 }

 public void setInfo(String sAuthor, float price, String sName) {
 this.sAuthor = sAuthor;
 this.price = price;
 this.sName = sName;
 priceChanged();
 }

 public String getsAuthor() {
 return sAuthor;
 }

 public float getprice() {
 return price;
 }

 public String getsName() {
 return sName;
 }
}
package market;
import market.BID;

public class Market {


  public static void main(String[] args) {

    // New parameters will be given to the "market" for groups of people to use as deciding factors

    BidSortedMap  bidSortedMap = new BidSortedMap();

    // Make a bid
    BID bid1 = new BID();
    bid1.setName("Rocky");
    bid1.setPrice(9.3);
    bidSortedMap.addBID(bid1);

    BID bid2 = new BID();
    bid2.setName("John");
    bid2.setPrice(9.3);
    bidSortedMap.addBID(bid2);

    BID bid3 = new BID();
    bid3.setName("Greg");
    bid3.setPrice(9.5);
    bidSortedMap.addBID(bid3);

    bidSortedMap.displayAll();

    AskSortedMap  askSortedMap = new AskSortedMap();
    // Make a ask
    ASK ask1 = new ASK();
    ask1.setName("REI");
    ask1.setPrice(10.3);
    askSortedMap.addASK(ask1);

    ASK ask2 = new ASK();
    ask2.setName("Stew");
    ask2.setPrice(10.3);
    askSortedMap.addASK(ask2);

    ASK ask3 = new ASK();
    ask3.setName("Steve");
    ask3.setPrice(10.5);
    askSortedMap.addASK(ask3);

    askSortedMap.displayAll();
  }
}

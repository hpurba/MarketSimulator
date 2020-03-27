package market;

import java.util.SortedMap;
import java.util.TreeMap;

public class BidSortedMap {
  private SortedMap<Double, BidQueue> sortedBidMap = new TreeMap();


  public void addBID(BID bid){
    Double bidPrice = bid.getPrice();

    // bid price doesn't exist in the queue
    if(sortedBidMap.get(bidPrice) == null) {
      BidQueue bidQueue = new BidQueue();
      bidQueue.addBid(bid);
      sortedBidMap.put(bid.getPrice(), bidQueue);
    }
    else {
      BidQueue bidQueue = new BidQueue();
      bidQueue = sortedBidMap.get(bidPrice);
      bidQueue.addBid(bid);
      sortedBidMap.replace(bid.getPrice(), bidQueue);
    }
  }

  public void removeBID(){

  }

  public void displayAll(){
    System.out.println("--- BIDS --- --- ---");
    // iterate through the bidmap and the bidqueue
    for(Double bidPrice: sortedBidMap.keySet()){
      System.out.println("Bid Price: " + bidPrice);
      BidQueue bidQueue = sortedBidMap.get(bidPrice);
      System.out.println("Quantity: " + bidQueue.getBidQueueLength());
      System.out.print("In Queue:" );
      bidQueue.printQueue();
    }
    System.out.println("--- --- --- --- ---");
  }
}

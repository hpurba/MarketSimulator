package market;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class BidQueue {

  private Queue<BID> BidQueue = new LinkedList<>();

  public void addBid(BID bid) {
    BidQueue.add(bid);
  }

  public void removeBid(BID bid) {
    BidQueue.remove(bid);
  }

  public Integer getBidQueueLength() {
    return BidQueue.size();
  }

  public void printQueue() {

    // Setting the ListIterator at a specified position
    Iterator queueIterator = BidQueue.iterator();

    // Iterating through the created queue
    while(queueIterator.hasNext()){
      BID tempBid = new BID();
      tempBid = (BID) queueIterator.next();

      System.out.print(tempBid.getName());

      if(!queueIterator.hasNext()){
        System.out.println(".");
      }
      else{
        System.out.print(", ");
      }
    }


  }
}

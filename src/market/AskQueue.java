package market;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class AskQueue {
  private Queue<ASK> AskQueue= new LinkedList<>();

  public void addAsk(ASK ask) {
    AskQueue.add(ask);
  }

  public void removeAsk(ASK ask) {
    AskQueue.remove(ask);
  }

  public Integer getAskQueueLength() {
    return AskQueue.size();
  }

  public void printQueue() {

    // Setting the ListIterator at a specified position
    Iterator queueIterator = AskQueue.iterator();

    // Iterating through the created queue
    while(queueIterator.hasNext()){
      ASK tempAsk = new ASK();
      tempAsk = (ASK) queueIterator.next();

      System.out.print(tempAsk.getName());

      if(!queueIterator.hasNext()){
        System.out.println(".");
      }
      else{
        System.out.print(", ");
      }
    }
  }
}

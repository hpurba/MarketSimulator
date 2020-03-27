package market;

import java.util.SortedMap;
import java.util.TreeMap;

public class AskSortedMap {
  private SortedMap<Double, AskQueue> sortedAskMap = new TreeMap();


  public void addASK(ASK ask){
    Double askPrice = ask.getPrice();

    // bid price doesn't exist in the queue
    if(sortedAskMap.get(askPrice) == null) {
      AskQueue askQueue = new AskQueue();
      askQueue.addAsk(ask);
      sortedAskMap.put(ask.getPrice(), askQueue);
    }
    else {
      AskQueue askQueue = new AskQueue();
      askQueue = sortedAskMap.get(askPrice);
      askQueue.addAsk(ask);
      sortedAskMap.replace(ask.getPrice(), askQueue);
    }
  }

  public void removeASK(){

  }

  public void displayAll(){
    System.out.println("--- ASKS --- --- ---");
    // iterate through the bidmap and the bidqueue
    for(Double askPrice: sortedAskMap.keySet()){
      System.out.println("Ask Price: " + askPrice);
      AskQueue askQueue = sortedAskMap.get(askPrice);
      System.out.println("Quantity: " + askQueue.getAskQueueLength());
      System.out.print("In Queue:" );
      askQueue.printQueue();
    }
    System.out.println("--- --- --- --- ---");
  }
}

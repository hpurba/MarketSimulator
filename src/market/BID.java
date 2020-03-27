package market;

public class BID {
  String name;  // name of person or organization responsible for the bid
  Double price;

  // Setter
  public void setName(String name) {
    this.name=name;
  }
  public void setPrice(Double price) {
    this.price=price;
  }

  // Getter
  public String getName() {
    return name;
  }
  public Double getPrice() {
    return price;
  }
}


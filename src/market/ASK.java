package market;

public class ASK {
  String name;  // name of person or organization responsible for the ask
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

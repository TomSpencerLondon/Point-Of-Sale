public class Item {
  private final String description;
  private final Money price;

  public Item(String description, Money price) {
    this.description = description;
    this.price = price;
  }

  public double price() {
    return this.price.amount();
  }

  public void print(Printer p) {
    new ItemFormat(description, price).print(p);
  }
}

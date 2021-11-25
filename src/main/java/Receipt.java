import java.util.ArrayList;
import java.util.List;

public class Receipt {
  private final Printer printer;
  private final List<Item> items = new ArrayList<>();

  private final Total total = new Total();

  public Receipt(Printer p) {
    this.printer = p;
  }

  public void add(String description, Money price) {
    items.add(new Item(description, price));
  }

  public void print() {
    items.forEach(item -> {
      item.print(printer);
      total.add(item.price());
    });

    total.print(printer);
  }
}

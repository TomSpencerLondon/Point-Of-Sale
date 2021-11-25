public class ReceiptDemo {

  public static void main(String[] commandLineArgs) {
    new ReceiptDemo().run();
  }

  private void run() {
    final Receipt r = new Receipt(new Printer());

    // Nice cheese and wine evening

    r.add("Brie", new Money("1.95", "GBP"));
    r.add("Tiger Bread", new Money("0.95", "GBP"));
    r.add("Merlot", new Money("7.95", "GBP"));

    r.print();
  }
}

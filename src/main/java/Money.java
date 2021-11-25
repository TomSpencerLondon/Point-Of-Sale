public class Money {
  private final String amount;
  private String currency;

  public Money(String amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  public double amount() {
    return Double.parseDouble(this.amount);
  }

  public void print(Printer p) {
    p.print(currency);
    p.print(amount);
    p.newLine();
  }
}

public class Total {
  private double total = 0.0;
  public void add(double amount) {
    total += amount;
  }

  public void print(Printer p) {
    p.newLine();
    p.print(String.format("Total: £%4.2f", total));
  }
}

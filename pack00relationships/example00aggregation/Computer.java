package pack00relationships.example00aggregation;

public class Computer {
  public Printer printer;

  public Computer(Printer printer) {
    this.printer = printer;
  }

  // other parts..
};

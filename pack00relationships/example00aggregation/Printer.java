package pack00relationships.example00aggregation;

// A printer can be shared with other computers.
public class Printer {

  public String model;

  public Printer(String model) {
    this.model = model;
  }

  public String toString() {
    return String.format("Printer[model='%s']", model);
  }
};

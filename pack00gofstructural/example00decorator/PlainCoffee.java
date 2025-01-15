package pack00gofstructural.example00decorator;

// PlainCoffee
public class PlainCoffee implements Coffee {
  @Override
  public String getDescription() {
    return "Plain Coffee";
  }

  @Override
  public double getCost() {
    return 2.0;
  }
}

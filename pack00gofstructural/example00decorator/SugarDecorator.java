package pack00gofstructural.example00decorator;

// SugarDecorator
public class SugarDecorator extends CoffeeDecorator {
  public SugarDecorator(Coffee decoratedCoffee) {
    super(decoratedCoffee);
  }

  @Override
  public String getDescription() {
    return decoratedCoffee.getDescription() + ", Sugar";
  }

  @Override
  public double getCost() {
    return decoratedCoffee.getCost() + 0.2;
  }
}
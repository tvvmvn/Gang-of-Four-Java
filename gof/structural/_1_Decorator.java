package structural;

// Coffee
interface Coffee {
  String getDescription();
  double getCost();
}

// PlainCoffee
class PlainCoffee implements Coffee {
  @Override
  public String getDescription() {
    return "Plain Coffee";
  }

  @Override
  public double getCost() {
    return 2.0;
  }
}

// CoffeeDecorator
abstract class CoffeeDecorator implements Coffee {
  protected Coffee decoratedCoffee;

  public CoffeeDecorator(Coffee decoratedCoffee) {
    this.decoratedCoffee = decoratedCoffee;
  }

  @Override
  public String getDescription() {
    return decoratedCoffee.getDescription();
  }

  @Override
  public double getCost() {
    return decoratedCoffee.getCost();
  }
}

// MilkDecorator
class MilkDecorator extends CoffeeDecorator {
  public MilkDecorator(Coffee decoratedCoffee) {
    super(decoratedCoffee);
  }

  @Override
  public String getDescription() {
    return decoratedCoffee.getDescription() + ", Milk";
  }

  @Override
  public double getCost() {
    return decoratedCoffee.getCost() + 0.5;
  }
}

// SugarDecorator
class SugarDecorator extends CoffeeDecorator {
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

// Main
public class _1_Decorator {
  public static void main(String[] args) {
    // Plain Coffee
    Coffee coffee = new PlainCoffee();
    // Coffee with Milk
    Coffee milkCoffee = new MilkDecorator(coffee);
    // Coffee with Sugar and Milk
    Coffee sugarMilkCoffee = new SugarDecorator(milkCoffee);
    
    // Plain coffee
    System.out.println("Description: " + coffee.getDescription());
    System.out.println("Cost: $" + coffee.getCost());
    // Coffee with Milk
    System.out.println("Description: " + milkCoffee.getDescription());
    System.out.println("Cost: $" + milkCoffee.getCost());
    // Coffee with Sugar and Milk
    System.out.println("Description: " + sugarMilkCoffee.getDescription());
    System.out.println("Cost: $" + sugarMilkCoffee.getCost());
  }
}


/*
Output

Description: Plain Coffee
Cost: $2.0

Description: Plain Coffee, Milk
Cost: $2.5

Description: Plain Coffee, Milk, Sugar
Cost: $2.7
*/
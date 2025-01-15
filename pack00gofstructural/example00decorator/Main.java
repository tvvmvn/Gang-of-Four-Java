package pack00gofstructural.example00decorator;

public class Main {
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
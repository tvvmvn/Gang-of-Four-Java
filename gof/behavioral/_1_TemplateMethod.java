package behavioral;
// Abstract class defining the template method
abstract class BeverageMaker {
  // * Template Method defining the overall process
  public final void makeBeverage() {
    // 4 steps for making bevarages
    boilWater();
    brew();
    pourInCup();
    addCondiments();
  }

  // Abstract methods to be implemented by subclasses
  abstract void brew();
  abstract void addCondiments();

  // Common methods to increase code reusablility
  void boilWater() {
    System.out.println("Boiling water");
  }

  void pourInCup() {
    System.out.println("Pouring into cup");
  }
}

// Concrete subclass for making tea
class TeaMaker extends BeverageMaker {
  // Implementing abstract methods
  @Override
  void brew() {
    System.out.println("Steeping the tea");
  }

  @Override
  void addCondiments() {
    System.out.println("Adding lemon");
  }
}

// Concrete subclass for making coffee
class CoffeeMaker extends BeverageMaker {
  // Implementing abstract methods
  @Override
  void brew() {
    System.out.println("Dripping coffee through filter");
  }

  @Override
  void addCondiments() {
    System.out.println("Adding sugar and milk");
  }
}

public class _1_TemplateMethod {
  public static void main(String[] args) {
    // Tea
    System.out.println("Making tea:");
    BeverageMaker teaMaker = new TeaMaker();
    teaMaker.makeBeverage();

    // Coffee
    System.out.println("\nMaking coffee:");
    BeverageMaker coffeeMaker = new CoffeeMaker();
    coffeeMaker.makeBeverage();
  }
}


/* 
Output

Making tea:
Boiling water
Steeping the tea
Pouring into cup
Adding lemon

Making coffee:
Boiling water
Dripping coffee through filter
Pouring into cup
Adding sugar and milk
*/
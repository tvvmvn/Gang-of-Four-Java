package pack00gofbehavioral.example00templatemethod;

// Abstract class defining the template method
public abstract class BeverageMaker {
  
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

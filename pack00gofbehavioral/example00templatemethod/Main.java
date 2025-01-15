package pack00gofbehavioral.example00templatemethod;

public class Main {
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
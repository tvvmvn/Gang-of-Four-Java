package pack00relationships.example00dependency;

public class Car {

  // Gasoline as parameters
  public void drive(Gasoline gasoline) {

    gasoline.fill();

    System.out.println("The car is running");
  }
};

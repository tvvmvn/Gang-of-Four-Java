package pack00relationships.example00dependency;

public class Car {

  public void drive(Gasoline gasoline) {

    gasoline.fill();

    System.out.println("The car is running");
  }
};

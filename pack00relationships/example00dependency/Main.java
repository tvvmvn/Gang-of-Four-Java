package pack00relationships.example00dependency;

public class Main {
  public static void main(String[] args) {
    
    Gasoline gasoline = new Gasoline();

    Car car = new Car();

    car.drive(gasoline);
  }
}

// Output
// The car is running
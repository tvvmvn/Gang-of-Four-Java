package pack00gofcreational.example00abstractfactory;

// Concrete Factory for North America Cars
public class NorthAmericaCarFactory implements CarFactory {
  public Car createCar() {
    return new Sedan();
  }

  public CarSpecification createSpecification() {
    return new NorthAmericaSpecification();
  }
}

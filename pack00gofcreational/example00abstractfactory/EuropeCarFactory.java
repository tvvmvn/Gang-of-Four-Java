package pack00gofcreational.example00abstractfactory;

// Concrete Factory for Europe Cars
public class EuropeCarFactory implements CarFactory {
  public Car createCar() {
    return new Hatchback();
  }

  public CarSpecification createSpecification() {
    return new EuropeSpecification();
  }
}

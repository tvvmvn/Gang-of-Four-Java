package pack00gofcreational.example00abstractfactory;

// Concrete Product for Europe Car Specification
public class EuropeSpecification implements CarSpecification {
  public void display() {
    System.out.println("Europe Car Specification: Fuel efficiency and emissions compliant with EU standards.");
  }
}
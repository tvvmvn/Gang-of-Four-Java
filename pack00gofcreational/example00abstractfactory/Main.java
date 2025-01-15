package pack00gofcreational.example00abstractfactory;

public class Main {
  public static void main(String[] args) {

    // Creating cars targeting North America
    CarFactory northAmericaFactory = new NorthAmericaCarFactory();
    Car northAmericaCar = northAmericaFactory.createCar();
    CarSpecification northAmericaSpec = northAmericaFactory.createSpecification();

    northAmericaCar.assemble();
    northAmericaSpec.display();

    // Creating cars targeting Europe
    CarFactory europeFactory = new EuropeCarFactory();
    Car europeCar = europeFactory.createCar();
    CarSpecification europeSpec = europeFactory.createSpecification();

    europeCar.assemble();
    europeSpec.display();
  }
}


/* 
Output

Assembling Sedan car.
North America Car Specification: Safety features compliant with local regulations.

Assembling Hatchback car.
Europe Car Specification: Fuel efficiency and emissions compliant wit...
*/
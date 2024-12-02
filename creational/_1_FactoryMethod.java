package creational;

// Product Interface
abstract class Vehicle {
  public abstract void printVehicle();
}

// Factory Interface
interface VehicleFactory {
  Vehicle createVehicle();
}

// Concrete Product: TwoWheeler
class TwoWheeler extends Vehicle {
  public void printVehicle() {
    System.out.println("I am two wheeler");
  }
}

// Concrete Product: FourWheeler
class FourWheeler extends Vehicle {
  public void printVehicle() {
    System.out.println("I am four wheeler");
  }
}

// Concrete Factory: TwoWheeler
class TwoWheelerFactory implements VehicleFactory {
  public Vehicle createVehicle() {
    return new TwoWheeler();
  }
}

// Concrete Factory: FourWheeler
class FourWheelerFactory implements VehicleFactory {
  public Vehicle createVehicle() {
    return new FourWheeler();
  }
}

// Client
public class _1_FactoryMethod {
  public static void main(String[] args) {
    VehicleFactory twoWheelerFactory = new TwoWheelerFactory();
    VehicleFactory fourWheelerFactory = new FourWheelerFactory();

    Vehicle twoWheeler = twoWheelerFactory.createVehicle();
    Vehicle fourWheeler = fourWheelerFactory.createVehicle();
    
    twoWheeler.printVehicle();
    fourWheeler.printVehicle();
  }
}

/* 
Output

I am two wheeler
I am four wheeler
*/
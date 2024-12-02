package structural;
// abstraction
abstract class Vehicle {
  protected Workshop workShop1;
  protected Workshop workShop2;

  protected Vehicle(Workshop workShop1, Workshop workShop2) {
    this.workShop1 = workShop1;
    this.workShop2 = workShop2;
  }

  abstract public void manufacture();
}

// Implementer
interface Workshop {
  abstract public void work();
}

// Refine abstraction 1 
class Car extends Vehicle {
  public Car(Workshop workShop1, Workshop workShop2) {
    super(workShop1, workShop2);
  }

  @Override
  public void manufacture() {
    System.out.print("Car ");
    
    workShop1.work();
    workShop2.work();
  }
}

// Refine abstraction 2 
class Bike extends Vehicle {
  public Bike(Workshop workShop1, Workshop workShop2) {
    super(workShop1, workShop2);
  }

  @Override
  public void manufacture() {
    System.out.print("Bike ");
    workShop1.work();
    workShop2.work();
  }
}

// Concrete implementation 1
class Produce implements Workshop {
  @Override
  public void work() {
    System.out.print("produced");
  }
}

// Concrete implementation 2
class Assemble implements Workshop {
  @Override
  public void work() {
    System.out.print(" and");
    System.out.println(" assembled.");
  }
}

// Demonstration of bridge pattern
public class _1_Bridge {
  public static void main(String[] args) {
    Vehicle vehicle1 = new Car(new Produce(), new Assemble());
    Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
    
    vehicle1.manufacture();
    vehicle2.manufacture();
  }
}


/* 
Output

Car produced and assembled.
Bike produced and assembled.
*/
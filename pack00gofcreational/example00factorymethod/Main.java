package pack00gofcreational.example00factorymethod;

// Client
public class Main {
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
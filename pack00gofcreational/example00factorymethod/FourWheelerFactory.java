package pack00gofcreational.example00factorymethod;

// Concrete Factory: FourWheeler
public class FourWheelerFactory implements VehicleFactory {
  public Vehicle createVehicle() {
    return new FourWheeler();
  }
}
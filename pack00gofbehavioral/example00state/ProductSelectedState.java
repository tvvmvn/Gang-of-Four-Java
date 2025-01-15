package pack00gofbehavioral.example00state;

public class ProductSelectedState implements VendingMachineState {
  
  @Override
  public void handleRequest() {
    System.out.println("Product selected: Processing payment.");
  }
}


package pack00gofbehavioral.example00state;

// Concrete states
public class ReadyState implements VendingMachineState {
  @Override
  public void handleRequest() {
    System.out.println("Ready: Please select a product.");
  }
}
package pack00gofbehavioral.example00state;


public class PaymentPendingState implements VendingMachineState {
  
  @Override
  public void handleRequest() {
    System.out.println("Payment pending: Dispensing product.");
  }
}

package behavioral;
// Interface for state
interface VendingMachineState {
  // It has handling methods of state
  void handleRequest();
}

// Concrete states
class ReadyState implements VendingMachineState {
  @Override
  public void handleRequest() {
    System.out.println("Ready: Please select a product.");
  }
}

class ProductSelectedState implements VendingMachineState {
  @Override
  public void handleRequest() {
    System.out.println("Product selected: Processing payment.");
  }
}

class PaymentPendingState implements VendingMachineState {
  @Override
  public void handleRequest() {
    System.out.println("Payment pending: Dispensing product.");
  }
}

// Context
class VendingMachineContext {
  private VendingMachineState state;

  public void setState(VendingMachineState state) {
    this.state = state;
  }

  public void request() {
    state.handleRequest();
  }
}

// Main
public class _1_State {
  public static void main(String[] args) {
    // Context
    VendingMachineContext vendingMachine = new VendingMachineContext();

    // An User is about to use machine and
    vendingMachine.setState(new ReadyState());
    vendingMachine.request();

    // An User selected a item and
    vendingMachine.setState(new ProductSelectedState());
    vendingMachine.request();

    // An User inserted coin to machine and
    vendingMachine.setState(new PaymentPendingState());
    vendingMachine.request();

    // Payment has done, machine dispensed an item.
  }
}


/* 
Output

Ready state: Please select a product.

Product selected state: Processing payment.

Payment pending state: Dispensing product.

Out of stock state: Product unavailable. Please select another product.
*/
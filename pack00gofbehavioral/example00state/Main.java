package pack00gofbehavioral.example00state;

public class Main {
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
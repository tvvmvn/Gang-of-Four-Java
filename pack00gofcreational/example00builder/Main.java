package pack00gofcreational.example00builder;

public class Main {
  public static void main(String args[]) {
    
    // Director
    ComputerAssembler assembler = new ComputerAssembler();

    // Products
    Computer desktop = assembler.assembleDesktop();

    System.out.println("Desktop Computer Configuration:");
    desktop.display();
  }
}

// Output
// Desktop Computer Configuration:
// CPU: Intel i7
// Memory: 16GB
// Storage: 512GB SSD
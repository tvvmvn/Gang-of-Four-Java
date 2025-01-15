package pack00gofcreational.example00builder;

// Director
public class ComputerAssembler {
  private ComputerBuilder _desktopBuilder = new DesktopComputerBuilder();
  
  public Computer assembleDesktop() {
    _desktopBuilder.buildCPU("Intel i7");
    _desktopBuilder.buildMemory("16GB");
    _desktopBuilder.buildStorage("512GB SSD");
    
    return _desktopBuilder.getResult();
  }
};
package pack00gofcreational.example00builder;

// Concrete Builder
public class DesktopComputerBuilder implements ComputerBuilder {
  
  private Computer _computer;
  
  public DesktopComputerBuilder() {
    _computer = new Computer();
  }

  @Override
  public void buildCPU(String cpu) {
    _computer.setCPU(cpu);
  }
  
  @Override
  public void buildMemory(String memory) {
    _computer.setMemory(memory);
  }
  
  @Override
  public void buildStorage(String storage) {
    _computer.setStorage(storage);
  }
  
  @Override
  public Computer getResult() {
    return _computer;
  }
};
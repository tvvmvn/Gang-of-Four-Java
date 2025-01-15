package pack00gofcreational.example00builder;

// Product class
public class Computer {
  private String _cpu;
  private String _memory;
  private String _storage;

  public void setCPU(String cpu) {
    _cpu = cpu;
  }

  public void setMemory(String memory) {
    _memory = memory;
  }

  public void setStorage(String storage) {
    _storage = storage;
  }

  public void display() {
    System.out.println("CPU: " + _cpu);
    System.out.println("Memory: " + _memory);
    System.out.println("Storage: " + _storage);
  }
};
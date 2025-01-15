package pack00gofcreational.example00builder;

// Builder interface
public interface ComputerBuilder {
  public void buildCPU(String cpu);
  public void buildMemory(String memory);
  public void buildStorage(String storage);
  public Computer getResult();
};

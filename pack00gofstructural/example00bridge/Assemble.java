package pack00gofstructural.example00bridge;

// Concrete implementation 2
public class Assemble implements Workshop {
  
  @Override
  public void work() {
    System.out.print(" and");
    System.out.println(" assembled.");
  }
}


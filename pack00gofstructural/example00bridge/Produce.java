package pack00gofstructural.example00bridge;

// Concrete implementation 1
public class Produce implements Workshop {

  @Override
  public void work() {
    System.out.print("produced");
  }
}


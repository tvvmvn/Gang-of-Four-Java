package pack00relationships.example00realization;

public class Main {
  public static void main(String[] args) {
    
    Flyable plane = new Plane();
    plane.fly();
    
    Flyable bird = new Bird();
    bird.fly();
  }
}

// Output
// It can fly with technology
// It can fly with wings
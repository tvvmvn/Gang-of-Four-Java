package pack00gofstructural.example00bridge;

// Demonstration of bridge pattern
public class Main {
  public static void main(String[] args) {
    Vehicle vehicle1 = new Car(new Produce(), new Assemble());
    Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
    
    vehicle1.manufacture();
    vehicle2.manufacture();
  }
}


/* 
Output

Car produced and assembled.
Bike produced and assembled.
*/
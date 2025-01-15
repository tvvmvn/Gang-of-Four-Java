package pack00elements.example00object;

class Main {
  public static void main(String[] args) {

    // Instances of Car
    Car avante = new Car();
    avante.engine = "Gasoline";
    avante.run();
    
    Car xm3Hybrid = new Car();
    xm3Hybrid.engine = "Hybrid";
    xm3Hybrid.run();
  }
}

// Output
// Running powered by Gasoline
// Running powered by Hybrid
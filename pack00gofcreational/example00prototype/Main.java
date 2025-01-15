package pack00gofcreational.example00prototype;

public class Main {
  public static void main(String[] args) {
    // Create a concrete prototype (a red circle).
    Shape circlePrototype = new Circle("red");

    // Use the prototype to create a new shape (a red circle).
    Shape redCircle = circlePrototype.clone();

    // copy circle prototype.
    redCircle.draw();
  }
}

/* 
Output 

Drawing a red circle.
*/
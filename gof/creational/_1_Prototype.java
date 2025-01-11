package creational;

// Interface Prototype: Shape
interface Shape {
  Shape clone();  // Make a copy of itself
  void draw();  // Draw the shape
}

// Concrete Prototype: Circle
class Circle implements Shape {
  private String color;

  // When you create a circle, you give it a color.
  public Circle(String color) {
    this.color = color;
  }

  // This creates a copy of the circle.
  @Override
  public Shape clone() {
    return new Circle(this.color);
  }

  // This is how a circle draws itself.
  @Override
  public void draw() {
    System.out.println("Drawing a " + color + " circle.");
  }
}

// Client
public class _1_Prototype {
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
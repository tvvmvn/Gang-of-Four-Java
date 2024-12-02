package behavioral;
import java.util.ArrayList;

// Element interface
interface Shape {
  void accept(ShapeVisitor visitor);
};
 
// Concrete Element
class Circle implements Shape {
  @Override
  public void accept(ShapeVisitor visitor) {
      visitor.visit(this);
    }
};
 
// Concrete Element
class Square implements Shape {
  @Override
  public void accept(ShapeVisitor visitor) {
    visitor.visit(this);
  }
};
 
// Visitor interface
interface ShapeVisitor {
  void visit(Circle circle);
  void visit(Square square);
};
 
// Concrete Visitor
class DrawingVisitor implements ShapeVisitor {
  @Override
  public void visit(Circle circle) {
    System.out.println("Drawing a Circle");
  }
  
  @Override
  public void visit(Square square) {
    System.out.println("Drawing a Square");
  }
};
 
// Concrete Visitor
class AreaVisitor implements ShapeVisitor {
  @Override
  public void visit(Circle circle) {
    System.out.println("Calculating area of Circle");
  }
  
  @Override
  public void visit(Square square) {
    System.out.println("Calculating area of Square");
  }
};
 
// Object Structure
class ShapeContainer {
  private ArrayList<Shape> shapes = new ArrayList<Shape>();

  public void addShape(Shape shape) {
    shapes.add(shape);
  }
  
  public void performOperations(ShapeVisitor visitor) {
    for (Shape shape : shapes) {
      shape.accept(visitor);
    }
  }
};
 
public class _1_Visitor {
  public static void main(String[] args) {
    // Create instances of shapes
    Shape circle = new Circle();
    Shape square = new Square();
  
    // Create a container and add shapes to it
    ShapeContainer container = new ShapeContainer();
    container.addShape(circle);
    container.addShape(square);
  
    // Create visitors
    ShapeVisitor drawingVisitor = new DrawingVisitor();
    ShapeVisitor areaVisitor = new AreaVisitor();
  
    // Perform operations like drawing, caculating
    container.performOperations(drawingVisitor);
    container.performOperations(areaVisitor);
  }
}


/*
Output

Drawing a Circle
Drawing a Square

Calculating area of Circle
Calculating area of Square
*/
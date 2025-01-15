package pack00gofbehavioral.example00visitor;
 
public class Main {
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
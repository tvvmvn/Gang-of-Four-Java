package pack00gofbehavioral.example00visitor;
import java.util.ArrayList;

// Object Structure
public class ShapeContainer {
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
 

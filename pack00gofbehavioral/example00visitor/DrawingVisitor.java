package pack00gofbehavioral.example00visitor;

// Concrete Visitor
public class DrawingVisitor implements ShapeVisitor {
  @Override
  public void visit(Circle circle) {
    System.out.println("Drawing a Circle");
  }
  
  @Override
  public void visit(Square square) {
    System.out.println("Drawing a Square");
  }
};

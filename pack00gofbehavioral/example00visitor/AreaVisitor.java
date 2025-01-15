package pack00gofbehavioral.example00visitor;

// Concrete Visitor
public class AreaVisitor implements ShapeVisitor {
  @Override
  public void visit(Circle circle) {
    System.out.println("Calculating area of Circle");
  }
  
  @Override
  public void visit(Square square) {
    System.out.println("Calculating area of Square");
  }
};

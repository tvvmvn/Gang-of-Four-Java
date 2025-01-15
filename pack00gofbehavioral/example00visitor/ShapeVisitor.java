package pack00gofbehavioral.example00visitor;

// Visitor interface
public interface ShapeVisitor {
  void visit(Circle circle);
  void visit(Square square);
};

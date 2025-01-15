package pack00gofbehavioral.example00visitor;

// Element interface
public interface Shape {
  void accept(ShapeVisitor visitor);
};

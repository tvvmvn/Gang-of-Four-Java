package pack00solid.example00lsp;

// Derived classes must be substitutable for their base class.
// and this is violation
public class Square extends Rectangle {

  @Override
  public int getSize() {
    return width * width;
  }
};

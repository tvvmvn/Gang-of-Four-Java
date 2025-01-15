package pack00solid.example00lsp;

public class Square extends Rectangle {

  @Override
  public int getSize() {
    return width * width;
  }
};

package pack00elements.example00message;

class Main {
  public static void main(String[] args) {

    Calculator cal = new Calculator();

    // objects sends messages to other objects.
    // (Ask other objects to process tasks)
    int r = cal.add(1, 2);

    System.out.print("x + y = ");
    System.out.print(r);
  }
}

// Output
// x + y = 2
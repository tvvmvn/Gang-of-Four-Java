package pack00elements.example00message;

class Main {
  public static void main(String[] args) {

    Calculator cal = new Calculator();

    // messages (request to object from outside)
    int r = cal.add(1, 2);

    System.out.print("1 + 2 = ");
    System.out.print(r);
  }
}

// Output
// x + y = 2
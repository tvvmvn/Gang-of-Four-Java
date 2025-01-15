package pack00relationships.example00generalization;

public class Main {
  public static void main(String[] args) {

    // Generalisation
    Coffee americano = new Americano("Columbia", "2l");
    Coffee latte = new Latte("Columbia", "2l", "Milk");

    System.out.println(americano);
    System.out.println(latte);
  }
}

// Output
// Americano[beans='Columbia', water='2l']
// Americano[beans='Columbia', water='2l', milk='Milk']
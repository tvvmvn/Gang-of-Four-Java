package pack00relationships.example00generalization;

public class Main {
  public static void main(String[] args) {

    // Generalisation 
    Person student = new Student("John", "Doe", 3);
    Person employee = new Employee("Jane", "Doe", "Marketing");
  }
}

// Output
// Americano[beans='Columbia', water='2l']
// Americano[beans='Columbia', water='2l', milk='Milk']
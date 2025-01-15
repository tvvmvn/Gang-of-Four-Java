package pack00relationships.example00association;

public class Main {
  public static void main(String[] args) {

    Address address = new Address("Seoul", "st");

    Person john = new Person("John", address);

    System.out.println(john.address);
  }
}

// Output
// Address[city='Seoul', street='st']
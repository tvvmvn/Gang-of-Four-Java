package pack00relationships.example00association;

public class Main {
  public static void main(String[] args) {

    Address address = new Address("New York", "11st");
    Person john = new Person(address);

    System.out.println(john.address);
  }
}

// Output
// Address[city='Seoul', street='st']
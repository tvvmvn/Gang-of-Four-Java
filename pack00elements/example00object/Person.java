package pack00elements.example00object;

class Person {
  // Attributes
  String firstName;
  String lastName;
  int age;

  // Operation 
  public String toString() {
    return String.format("Person[firstName='%s', lastName='%s', age='%d']", this.firstName, this.lastName, this.age);
  }
}

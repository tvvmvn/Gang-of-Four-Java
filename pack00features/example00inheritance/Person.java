package pack00features.example00inheritance;

public class Person {
  String firstName;
  String lastName;
  int age;

  public String toString() {
    return String.format("Person[firstName='%s', lastName='%s', age='%d']", this.firstName, this.lastName, this.age);
  }
}

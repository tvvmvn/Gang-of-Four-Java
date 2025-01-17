package pack00features.example00inheritance;

public class Student extends Person {
  int grade;

  @Override
  public String toString() {
    return String.format("Person[firstName='%s', lastName='%s', age='%d', grade='%d']", this.firstName, this.lastName, this.age, this.grade);
  }
}

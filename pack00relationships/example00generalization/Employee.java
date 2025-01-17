package pack00relationships.example00generalization;

public class Employee extends Person {
  
  public String dept;

  public Employee(String firstName, String lastName, String dept) {
    super(firstName, lastName);
    this.dept = dept;
  }
};
package pack00relationships.example00generalization;

public class Student extends Person {

  public int grade = 3;

  public Student(String firstName, String lastName, int grade) {
    super(firstName, lastName);
    this.grade = grade;
  }
};

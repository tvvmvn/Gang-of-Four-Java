package pack00features.example00inheritance;

public class Main {
  public static void main(String[] args) {
    
    Student student = new Student();

    student.firstName = "John";
    student.lastName = "Doe";
    student.age = 21;
    student.grade = 3;

    System.out.println(student);
  } 
}
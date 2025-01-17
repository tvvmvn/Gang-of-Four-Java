package pack00features.example00encapsulation;

public class Person {
  
  // only accessible in this class
  private int salary;
  
  // Getter
  public int getSalary() {
    return this.salary;
  }
  
  // Setter
  public void setSalary(int salary) {
    this.salary = salary;
  }
}

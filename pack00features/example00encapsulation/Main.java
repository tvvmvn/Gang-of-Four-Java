package pack00features.example00encapsulation;

public class Main {
  public static void main(String[] args) {
    
    Capsule capsule = new Capsule();

    capsule.setName("John");

    System.out.println(capsule.getName());
  }
}

// Output
// John
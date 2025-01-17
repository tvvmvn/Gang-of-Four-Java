package pack00features.example00polymorphism;

public class Main {
  public static void main(String[] args) {
     
    // Polymorphism?
    // Objects to be treated as instances of their parent class 
    // rather than their actual class.

    Animal dog = new Dog();
    dog.sound();

    Animal cat = new Cat();
    cat.sound();
    
    Animal pig = new Pig();    
    pig.sound();
  }
}


// Output
// bow wow
// meow
// wee wee
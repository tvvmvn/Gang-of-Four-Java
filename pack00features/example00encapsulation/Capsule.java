package pack00features.example00encapsulation;

public class Capsule {
  
  // only accessible in this class
  private String name; 
  
  // Getter
  public String getName() {
    return name;
  }
  
  // Setter
  public void setName(String name) {
    this.name = name;
  }
}

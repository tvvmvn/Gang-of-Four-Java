package pack00relationships.example00generalization;

public class Latte extends Coffee {
  
  public String water;
  public String milk;

  public Latte(String beans, String water, String milk) {
    
    super(beans);
    this.water = water;
    this.milk = milk;
  }

  @Override
  public String toString() {
    return String.format("Americano[beans='%s', water='%s', milk='%s']", beans, water, milk);
  }
};
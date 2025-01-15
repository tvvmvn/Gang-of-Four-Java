package pack00relationships.example00generalization;

public class Americano extends Coffee {

  public String water;

  public Americano(String beans, String water) {
    
    super(beans);
    this.water = water;
  }

  @Override
  public String toString() {
    return String.format("Americano[beans='%s', water='%s']", beans, water);
  }
};

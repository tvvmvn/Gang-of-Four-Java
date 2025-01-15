package pack00relationships.example00generalization;

public class Coffee {

  public String beans;

  public Coffee(String beans) {
    this.beans = beans;
  }

  public String toString() {
    return String.format("Americano[beans='%s']", beans);
  }
}

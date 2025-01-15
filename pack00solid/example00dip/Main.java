package pack00solid.example00dip;

public class Main {
  public static void main(String[] args) {

    Toy lego = new Lego();
    Kids k = new Kids();
  
    k.play(lego);
  }
}

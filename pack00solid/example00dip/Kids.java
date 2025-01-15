package pack00solid.example00dip;

public class Kids {

  // depends on toy interface, not on a concreate toy
  public void play(Toy toy) {
    toy.use();
  }
};

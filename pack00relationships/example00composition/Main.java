package pack00relationships.example00composition;

/*
In the UML, aggregation and composition are defined as 
special forms of associations with the intended meaning 
of classifying part-whole-relationships.
*/


public class Main {
  public static void main(String[] args) {
    
    AvanteEngine avanteEngine = new AvanteEngine();

    Avante avante = new Avante();
    
    avante.engine = avanteEngine;
  }
}
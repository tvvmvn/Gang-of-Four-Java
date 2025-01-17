package pack00relationships.example00aggregation;

/*
In the UML, aggregation and composition are defined as 
special forms of associations with the intended meaning 
of classifying part-whole-relationships.
*/

public class Main {
  public static void main(String[] args) {
    
    Printer printer = new Printer("HP p-100");
    
    ComputerA A = new ComputerA(printer);
    ComputerB B = new ComputerB(printer);
  }
}

// Output
// [model='P-115']
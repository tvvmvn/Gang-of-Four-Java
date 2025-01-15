package pack00gofbehavioral.example00interpreter;

// Concrete Expression: Number Expression
public class NumberExpression implements Expression {
  private int number;
 
  public NumberExpression(int number) {
    this.number = number;
  }
 
  @Override
  public int interpret(Context context) {
    return number;
  }
}

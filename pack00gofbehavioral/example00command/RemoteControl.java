package pack00gofbehavioral.example00command;

// Invoker
public class RemoteControl {
  private Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public void pressButton() {
    command.execute();
  }
}

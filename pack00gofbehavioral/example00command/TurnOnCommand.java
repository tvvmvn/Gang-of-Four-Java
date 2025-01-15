package pack00gofbehavioral.example00command;

// Concrete command for turning a device on
public class TurnOnCommand implements Command {
  private Device device; 

  public TurnOnCommand(Device device) {
    this.device = device;
  }

  @Override
  public void execute() {
    device.turnOn();
  }
}

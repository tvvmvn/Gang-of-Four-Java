package behavioral;

// Command interface
interface Command {
  void execute();
}

// Concrete command for turning a device on
class TurnOnCommand implements Command {
  private Device device; 

  public TurnOnCommand(Device device) {
    this.device = device;
  }

  @Override
  public void execute() {
    device.turnOn();
  }
}

// Concrete command for turning a device off
class TurnOffCommand implements Command {
  private Device device;

  public TurnOffCommand(Device device) {
    this.device = device;
  }

  @Override
  public void execute() {
    device.turnOff();
  }
}

// Concrete command for adjusting the volume of a stereo
class AdjustVolumeCommand implements Command {
  private Stereo stereo;

  public AdjustVolumeCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void execute() {
    stereo.adjustVolume();
  }
}

// Concrete command for changing the channel of a TV
class ChangeChannelCommand implements Command {
  private TV tv;

  public ChangeChannelCommand(TV tv) {
    this.tv = tv;
  }

  @Override
  public void execute() {
    tv.changeChannel();
  }
}

// Receiver interface
interface Device {
  void turnOn();
  void turnOff();
}

// Concrete receiver for a TV
class TV implements Device {
  @Override
  public void turnOn() {
    System.out.println("TV is now on");
  }

  @Override
  public void turnOff() {
    System.out.println("TV is now off");
  }

  public void changeChannel() {
    System.out.println("TV Channel has been changed");
  }
}

// Concrete receiver for a stereo
class Stereo implements Device {
  @Override
  public void turnOn() {
    System.out.println("Stereo is now on");
  }

  @Override
  public void turnOff() {
    System.out.println("Stereo is now off");
  }

  public void adjustVolume() {
    System.out.println("Stereo volume has been adjusted");
  }
}

// Invoker
class RemoteControl {
  private Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public void pressButton() {
    command.execute();
  }
}

// Example usage
public class _1_CommandPattern {
  public static void main(String[] args) {
    // Create devices
    TV tv = new TV();
    Stereo stereo = new Stereo();

    // Create command objects
    Command turnOnTVCommand = new TurnOnCommand(tv);
    Command changeChannelTVCommand = new ChangeChannelCommand(tv);
    Command turnOffTVCommand = new TurnOffCommand(tv);
    Command adjustVolumeStereoCommand = new AdjustVolumeCommand(stereo);

    // Invoker
    RemoteControl remote = new RemoteControl();

    // Set and execute commands
    remote.setCommand(turnOnTVCommand);
    remote.pressButton();
    remote.setCommand(changeChannelTVCommand);
    remote.pressButton();
    remote.setCommand(turnOffTVCommand);
    remote.pressButton();
    remote.setCommand(adjustVolumeStereoCommand);
    remote.pressButton();
  }
}


/* 
Output

TV is now on
TV Channel has been changed
TV is now off

Stereeo Volume has been adjusted
*/
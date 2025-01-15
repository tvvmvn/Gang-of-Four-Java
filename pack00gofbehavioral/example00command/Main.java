package pack00gofbehavioral.example00command;

// Example usage
public class Main {
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
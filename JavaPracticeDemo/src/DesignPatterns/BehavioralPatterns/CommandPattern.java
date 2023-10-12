package DesignPatterns.BehavioralPatterns;

//Command interface
interface Command {
 void execute();
}

//Concrete command: TurnOnCommand
class TurnOnCommand implements Command {
 private LightBulb lightBulb;

 public TurnOnCommand(LightBulb lightBulb) {
     this.lightBulb = lightBulb;
 }

 @Override
 public void execute() {
     lightBulb.turnOn();
 }
}

//Concrete command: TurnOffCommand
class TurnOffCommand implements Command {
 private LightBulb lightBulb;

 public TurnOffCommand(LightBulb lightBulb) {
     this.lightBulb = lightBulb;
 }

 @Override
 public void execute() {
     lightBulb.turnOff();
 }
}

//Concrete command: ToggleCommand
class ToggleCommand implements Command {
 private LightBulb lightBulb;

 public ToggleCommand(LightBulb lightBulb) {
     this.lightBulb = lightBulb;
 }

 @Override
 public void execute() {
     lightBulb.toggle();
 }
}

//Receiver: LightBulb
class LightBulb {
 private boolean isOn;

 public void turnOn() {
     isOn = true;
     System.out.println("Light bulb turned on");
 }

 public void turnOff() {
     isOn = false;
     System.out.println("Light bulb turned off");
 }

 public void toggle() {
     if (isOn) {
         turnOff();
     } else {
         turnOn();
     }
 }
}

//Invoker: RemoteControl
class RemoteControl {
 private Command command;

 public void setCommand(Command command) {
     this.command = command;
 }

 public void pressButton() {
     command.execute();
 }
}

//Client code
public class CommandPattern {
 public static void main(String[] args) {
     // Create the receiver
     LightBulb lightBulb = new LightBulb();

     // Create the commands
     Command turnOnCommand = new TurnOnCommand(lightBulb);
     Command turnOffCommand = new TurnOffCommand(lightBulb);
     Command toggleCommand = new ToggleCommand(lightBulb);

     // Create the invoker and associate it with the commands
     RemoteControl remoteControl = new RemoteControl();
     remoteControl.setCommand(turnOnCommand);

     // Press the button to turn on the light bulb
     remoteControl.pressButton();

     // Associate the invoker with a different command
     remoteControl.setCommand(turnOffCommand);

     // Press the button to turn off the light bulb
     remoteControl.pressButton();

     // Associate the invoker with another command
     remoteControl.setCommand(toggleCommand);

     // Press the button to toggle the light bulb
     remoteControl.pressButton();
 }
}

package DesignPatterns.StructuralPatterns;

//Subsystem classes
class CPU {
 public void start() {
     System.out.println("CPU started");
 }

 public void stop() {
     System.out.println("CPU stopped");
 }
}

class Memory {
 public void load() {
     System.out.println("Memory loaded");
 }

 public void unload() {
     System.out.println("Memory unloaded");
 }
}

class HardDrive {
 public void read() {
     System.out.println("Reading data from hard drive");
 }

 public void write() {
     System.out.println("Writing data to hard drive");
 }
}

//Facade class
class ComputerFacade {
 private CPU cpu;
 private Memory memory;
 private HardDrive hardDrive;

 public ComputerFacade() {
     this.cpu = new CPU();
     this.memory = new Memory();
     this.hardDrive = new HardDrive();
 }

 public void start() {
     System.out.println("Starting computer...");
     cpu.start();
     memory.load();
     hardDrive.read();
     System.out.println("Computer started");
 }

 public void stop() {
     System.out.println("Stopping computer...");
     cpu.stop();
     memory.unload();
     hardDrive.write();
     System.out.println("Computer stopped");
 }
}

//Client code
public class FacadePattern {
 public static void main(String[] args) {
     ComputerFacade computer = new ComputerFacade();

     // Start the computer using the facade
     computer.start();

     // Stop the computer using the facade
     computer.stop();
 }
}

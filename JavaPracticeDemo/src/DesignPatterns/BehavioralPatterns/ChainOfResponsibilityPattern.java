package DesignPatterns.BehavioralPatterns;

//Request class
class PurchaseRequest {
 private double amount;

 public PurchaseRequest(double amount) {
     this.amount = amount;
 }

 public double getAmount() {
     return amount;
 }
}

//Handler interface
interface PurchaseHandler {
 void setNextHandler(PurchaseHandler handler);
 void handleRequest(PurchaseRequest request);
}

//Concrete handler class
class Manager implements PurchaseHandler {
 private PurchaseHandler nextHandler;

 @Override
 public void setNextHandler(PurchaseHandler handler) {
     nextHandler = handler;
 }

 @Override
 public void handleRequest(PurchaseRequest request) {
     if (request.getAmount() <= 1000) {
         System.out.println("Manager approves the purchase request of $" + request.getAmount());
     } else if (nextHandler != null) {
         nextHandler.handleRequest(request);
     } else {
         System.out.println("No handler can process the purchase request of $" + request.getAmount());
     }
 }
}

class Director implements PurchaseHandler {
 private PurchaseHandler nextHandler;

 @Override
 public void setNextHandler(PurchaseHandler handler) {
     nextHandler = handler;
 }

 @Override
 public void handleRequest(PurchaseRequest request) {
     if (request.getAmount() <= 5000) {
         System.out.println("Director approves the purchase request of $" + request.getAmount());
     } else if (nextHandler != null) {
         nextHandler.handleRequest(request);
     } else {
         System.out.println("No handler can process the purchase request of $" + request.getAmount());
     }
 }
}

class CEO implements PurchaseHandler {
 private PurchaseHandler nextHandler;

 @Override
 public void setNextHandler(PurchaseHandler handler) {
     nextHandler = handler;
 }

 @Override
 public void handleRequest(PurchaseRequest request) {
     if (request.getAmount() <= 10000) {
         System.out.println("CEO approves the purchase request of $" + request.getAmount());
     } else {
         System.out.println("No handler can process the purchase request of $" + request.getAmount());
     }
 }
}

//Client code
public class ChainOfResponsibilityPattern {
 public static void main(String[] args) {
     // Create the handlers
     PurchaseHandler manager = new Manager();
     PurchaseHandler director = new Director();
     PurchaseHandler ceo = new CEO();

     // Set up the chain of responsibility
     manager.setNextHandler(director);
     director.setNextHandler(ceo);

     // Create a purchase request
     PurchaseRequest request1 = new PurchaseRequest(500);
     PurchaseRequest request2 = new PurchaseRequest(2500);
     PurchaseRequest request3 = new PurchaseRequest(8000);
     PurchaseRequest request4 = new PurchaseRequest(15000);

     // Process the purchase requests
     manager.handleRequest(request1);
     manager.handleRequest(request2);
     manager.handleRequest(request3);
     manager.handleRequest(request4);
 }
}

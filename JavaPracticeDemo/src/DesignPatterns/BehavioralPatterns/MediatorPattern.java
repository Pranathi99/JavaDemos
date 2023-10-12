package DesignPatterns.BehavioralPatterns;

import java.util.ArrayList;
import java.util.List;

//Mediator interface
interface ChatMediator {
 void sendMessage(String message, User sender);
 void addUser(User user);
}

//Concrete Mediator
class ChatMediatorImpl implements ChatMediator {
 private List<User> users;

 public ChatMediatorImpl() {
     this.users = new ArrayList<>();
 }

 @Override
 public void sendMessage(String message, User sender) {
     // Send the message to all users except the sender
     for (User user : users) {
         if (user != sender) {
             user.receiveMessage(message);
         }
     }
 }

 @Override
 public void addUser(User user) {
     users.add(user);
 }
}

//Colleague interface
interface User {
 void sendMessage(String message);
 void receiveMessage(String message);
}

//Concrete Colleague
class ChatUser implements User {
 private String name;
 private ChatMediator mediator;

 public ChatUser(String name, ChatMediator mediator) {
     this.name = name;
     this.mediator = mediator;
 }

 @Override
 public void sendMessage(String message) {
     System.out.println(name + " sends: " + message);
     mediator.sendMessage(message, this);
 }

 @Override
 public void receiveMessage(String message) {
     System.out.println(name + " receives: " + message);
 }
}

//Client code
public class MediatorPattern {
 public static void main(String[] args) {
     // Create the chat mediator
     ChatMediator mediator = new ChatMediatorImpl();

     // Create users and add them to the chat mediator
     User user1 = new ChatUser("User1", mediator);
     User user2 = new ChatUser("User2", mediator);
     User user3 = new ChatUser("User3", mediator);

     mediator.addUser(user1);
     mediator.addUser(user2);
     mediator.addUser(user3);

     // Send messages
     user1.sendMessage("Hello everyone!");
     user2.sendMessage("Hi User1!");
 }
}

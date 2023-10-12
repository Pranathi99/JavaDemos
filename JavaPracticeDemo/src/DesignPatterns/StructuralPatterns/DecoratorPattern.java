package DesignPatterns.StructuralPatterns;

//Component interface
interface Pizza {
 String getDescription();
 double getCost();
}

//Concrete component
class BasicPizza implements Pizza {
 @Override
 public String getDescription() {
     return "Basic Pizza";
 }

 @Override
 public double getCost() {
     return 5.0;
 }
}

//Decorator abstract class
abstract class PizzaDecorator implements Pizza {
 protected Pizza pizza;

 public PizzaDecorator(Pizza pizza) {
     this.pizza = pizza;
 }
}

//Concrete decorator
class CheeseDecorator extends PizzaDecorator {
 public CheeseDecorator(Pizza pizza) {
     super(pizza);
 }

 @Override
 public String getDescription() {
     return pizza.getDescription() + ", Cheese";
 }

 @Override
 public double getCost() {
     return pizza.getCost() + 1.0;
 }
}

//Concrete decorator
class TomatoDecorator extends PizzaDecorator {
 public TomatoDecorator(Pizza pizza) {
     super(pizza);
 }

 @Override
 public String getDescription() {
     return pizza.getDescription() + ", Tomato";
 }

 @Override
 public double getCost() {
     return pizza.getCost() + 0.5;
 }
}

//Client code
public class DecoratorPattern {
 public static void main(String[] args) {
     // Create a basic pizza
     Pizza pizza = new BasicPizza();

     // Decorate the pizza with cheese
     pizza = new CheeseDecorator(pizza);

     // Decorate the pizza with tomato
     pizza = new TomatoDecorator(pizza);

     // Print the description and cost of the decorated pizza
     System.out.println("Pizza description: " + pizza.getDescription());
     System.out.println("Pizza cost: $" + pizza.getCost());
 }
}


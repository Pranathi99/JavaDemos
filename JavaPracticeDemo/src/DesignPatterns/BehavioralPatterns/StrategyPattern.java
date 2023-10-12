package DesignPatterns.BehavioralPatterns;

//Strategy interface
interface PaymentStrategy {
 void pay(int amount);
}

//Concrete strategy classes
class CreditCardStrategy implements PaymentStrategy {
 private String cardNumber;
 private String expirationDate;
 private String cvv;

 public CreditCardStrategy(String cardNumber, String expirationDate, String cvv) {
     this.cardNumber = cardNumber;
     this.expirationDate = expirationDate;
     this.cvv = cvv;
 }

 @Override
 public void pay(int amount) {
     System.out.println("Paying $" + amount + " with credit card: " + cardNumber);
 }
}

class PayPalStrategy implements PaymentStrategy {
 private String email;
 private String password;

 public PayPalStrategy(String email, String password) {
     this.email = email;
     this.password = password;
 }

 @Override
 public void pay(int amount) {
     System.out.println("Paying $" + amount + " with PayPal account: " + email);
 }
}

//Context class
class ShoppingCart {
 private PaymentStrategy paymentStrategy;

 public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
     this.paymentStrategy = paymentStrategy;
 }

 public void checkout(int amount) {
     paymentStrategy.pay(amount);
 }
}

//Client code
public class StrategyPattern {
 public static void main(String[] args) {
     ShoppingCart cart = new ShoppingCart();

     // Add items to the shopping cart

     // Pay with credit card
     PaymentStrategy creditCardStrategy = new CreditCardStrategy("1234 5678 9012 3456", "12/25", "123");
     cart.setPaymentStrategy(creditCardStrategy);
     cart.checkout(100);

     // Pay with PayPal
     PaymentStrategy paypalStrategy = new PayPalStrategy("example@gmail.com", "password123");
     cart.setPaymentStrategy(paypalStrategy);
     cart.checkout(50);
 }
}

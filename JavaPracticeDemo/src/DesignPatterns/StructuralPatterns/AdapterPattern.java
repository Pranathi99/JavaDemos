package DesignPatterns.StructuralPatterns;
//Target interface
interface Rectangle {
 double getArea();
}

//Adaptee class
class LegacyRectangle {
 private double length;
 private double width;

 public LegacyRectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 public double calculateArea() {
     return length * width;
 }
}

//Adapter class
class RectangleAdapter implements Rectangle {
 private LegacyRectangle legacyRectangle;

 public RectangleAdapter(LegacyRectangle legacyRectangle) {
     this.legacyRectangle = legacyRectangle;
 }

 @Override
 public double getArea() {
     return legacyRectangle.calculateArea();
 }
}

//Client code
public class AdapterPattern {
 public static void main(String[] args) {
     // Create a LegacyRectangle object
     LegacyRectangle legacyRectangle = new LegacyRectangle(5, 10);

     // Create an adapter object
     RectangleAdapter adapter = new RectangleAdapter(legacyRectangle);

     // Use the adapter as a Rectangle
     double area = adapter.getArea();
     System.out.println("Area: " + area);
 }
}

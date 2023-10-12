package DesignPatterns.StructuralPatterns;

//Abstraction
abstract class Shape {
 protected Renderer renderer;

 public Shape(Renderer renderer) {
     this.renderer = renderer;
 }

 public abstract void draw();
}

//Implementations
interface Renderer {
 void render();
}

class ScreenRenderer implements Renderer {
 @Override
 public void render() {
     System.out.println("Rendering on screen");
 }
}

class PrinterRenderer implements Renderer {
 @Override
 public void render() {
     System.out.println("Printing on paper");
 }
}

//Refined Abstractions
class Circle extends Shape {
 public Circle(Renderer renderer) {
     super(renderer);
 }

 @Override
 public void draw() {
     System.out.println("Drawing a circle");
     renderer.render();
 }
}

class Square extends Shape {
 public Square(Renderer renderer) {
     super(renderer);
 }

 @Override
 public void draw() {
     System.out.println("Drawing a square");
     renderer.render();
 }
}

//Usage
public class BridgePattern {
 public static void main(String[] args) {
     // Drawing a circle on screen
     Shape circle = new Circle(new ScreenRenderer());
     circle.draw();

     // Drawing a square on paper
     Shape square = new Square(new PrinterRenderer());
     square.draw();
 }
}

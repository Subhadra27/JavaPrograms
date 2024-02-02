package oops;

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing a square");
    }
}
//This is an example of method overriding
//Same name, same signature but implementations are different in parent and child class
public class Abstract {
    public static void main(String[] args) {
        Shape circle = new Circle(); // Reference to a concrete subclass
        Shape square = new Square(); // Reference to another concrete subclass
        
        circle.draw(); // Calls the draw() method of the Circle class
        square.draw(); // Calls the draw() method of the Square class
    }
}

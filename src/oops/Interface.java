package oops;

interface Drawable {
    void draw();
}

class Circle1 implements Drawable {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square1 implements Drawable {
    public void draw() {
        System.out.println("Drawing a square");
    }
}

public class Interface {
    public static void main(String[] args) {
        Drawable circle = new Circle1(); // Reference to a class implementing Drawable
        Drawable square = new Square1(); // Reference to another class implementing Drawable
        
        circle.draw(); // Calls the draw() method of the Circle class
        square.draw(); // Calls the draw() method of the Square class
    }
}

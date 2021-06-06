package fan.stu.javaadvanced;

public class InterfaceDemo {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        circle.draw2();

        Square square = new Square();
        square.draw();
        square.draw2();
    }

}

interface Shape {
    public void draw();
    public default void draw2() {
        System.out.println("ShapeDraw2");
    }
}

interface Shape2 {
    public void draw();
    public default void draw2() {
        System.out.println("Shape2Draw2");
    }
}

class Circle implements Shape, Shape2 {

    @Override
    public void draw() {
        System.out.println("Circle");
    }

    @Override
    public void draw2() {
        // TODO Auto-generated method stub
        Shape.super.draw2();
    }
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square");
    }
}

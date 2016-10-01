package figureshere;

public class FiguresHere {

    public static void main(String[] args) {

        Rectangle rectangle;
        Triangle triangle1, triangle2, triangle3;
        Circle circle;

        rectangle = new Rectangle();
        circle = new Circle();
        triangle1 = new Triangle();
        triangle2 = new Triangle();
        triangle3 = new Triangle();

        System.out.println("Rectangles = " + Rectangle.count + " Площадь: " + (Rectangle.a * Rectangle.b));
        System.out.println("Circles = " + Circle.count + " Площадь: " + (Math.pow(Circle.r, 2) * 3.14));
        System.out.println("Triangles = " + Triangle.count + " Площадь: " + Math.sqrt((Triangle.f + Triangle.g + Triangle.h) / 2));
    }

}

class Rectangle {

    static int count = 0;
    static int a, b;

    Rectangle() {
        a = 10;
        b = 20;
        count++;
    }
}

class Circle {

    static int count = 0;
    static int r;

    public Circle() {
        r = 5;
        count++;
    }
}

class Triangle {

    static int count = 0;
    static int f, g, h;

    public Triangle() {
        f = 20;
        g = 25;
        h = 25;
        count++;
    }
}

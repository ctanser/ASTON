package Figures;

class Circle implements Figures {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Figures {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

class Triangle implements Figures {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double getArea() {
        //полупериметр
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        Rectangle rectangle = new Rectangle(7, 8);
        Triangle triangle = new Triangle(3, 4, 5);


        System.out.println("Периметр круга: " + circle.getPerimeter());
        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println(circle.getColor("Красный", "Черный")+"\n");

        System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
        System.out.println(rectangle.getColor("Красный", "Черный")+"\n");

        System.out.println("Периметр треугольника: " + triangle.getPerimeter());
        System.out.println("Площадь треугольника: " + triangle.getArea());
        System.out.println(triangle.getColor("Красный", "Черный"));
    }
}

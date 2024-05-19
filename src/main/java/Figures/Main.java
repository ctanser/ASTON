package Figures;

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

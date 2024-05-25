package Figures;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(7,"Красный", "Черный");
        Rectangle rectangle = new Rectangle(7, 8, "Оранжевый", "Черный");
        Triangle triangle = new Triangle(3, 4, 5, "Синий", "Черный");

        System.out.println("Периметр круга: " + circle.getPerimeter());
        System.out.println("Площадь круга: " + circle.getArea());
        circle.getColor();

        System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
        rectangle.getColor();

        System.out.println("Периметр треугольника: " + triangle.getPerimeter());
        System.out.println("Площадь треугольника: " + triangle.getArea());
        triangle.getColor();
    }
}

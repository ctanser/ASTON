package Figures;

class Triangle implements Figures {
    private final double side1;
    private final double side2;
    private final double side3;
    private final String fillColor;
    private final String borderColor;

    public Triangle(double side1, double side2, double side3, String fillColor, String borderColor) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
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

    @Override
    public void getColor() {
        System.out.println("Цвет заливки: " + fillColor + ", Цвет контура: " + borderColor);
    }
}

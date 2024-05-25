package Figures;

class Rectangle implements Figures {
    private final double length;
    private final double width;
    private String fillColor;
    private String borderColor;

    public Rectangle(double length, double width, String fillColor, String borderColor) {
        this.length = length;
        this.width = width;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void getColor() {
        System.out.println("Цвет заливки: " + fillColor + ", Цвет контура: " + borderColor);
    }
}

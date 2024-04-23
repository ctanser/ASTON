package Figures;

public interface Figures {

    default double getPerimeter() {
        throw new UnsupportedOperationException();
    }

    double getArea();

    default String getColor(String fillColor, String borderColor) {
        return "Цвет заливки: " + fillColor + ", Цвет контура: " + borderColor;
    }
}

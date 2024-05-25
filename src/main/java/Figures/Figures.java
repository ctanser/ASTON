package Figures;

public interface Figures {
    default double getPerimeter() {
        throw new UnsupportedOperationException();
    }

    double getArea();

    default void getColor() {
    }
}

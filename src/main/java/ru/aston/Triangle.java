package ru.aston;

public class Triangle implements IFigure {
    private final double a;
    private final double b;
    private final double c;
    private final String backgroundColor;
    private final String borderColor;

    public Triangle(double a, double b, double c, String backgroundColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getSquare() {
        return Math.sqrt(getPerimeter() / 2 * (getPerimeter() / 2 - a) * (getPerimeter() / 2 - b) * (getPerimeter() / 2 - c));
    }

    public String toString() {
        return String.format("Triangle, perimeter - %.2f, square - %.2f, border color - %s, background color - %s",
                getPerimeter(), getSquare(), getBorderColor(), getBackgroundColor());
    }
}

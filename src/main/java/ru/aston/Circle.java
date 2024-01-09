package ru.aston;

public class Circle implements IFigure {
    private final double r;
    private final String backgroundColor;
    private final String borderColor;

    public Circle(double r, String backgroundColor, String borderColor) {
        this.r = r;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    @Override
    public String getBackgroundColor() {
        return backgroundColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public double getSquare() {
        return Math.PI * r * r;
    }

    @Override
    public String toString() {
        return String.format("Circle, perimeter - %.2f, square - %.2f, border color - %s, background color - %s",
                getPerimeter(), getSquare(), getBorderColor(), getBackgroundColor());
    }
}

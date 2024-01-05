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

    public String toString(){
        return String.format("Triangle, perimeter - %.2f, square - %.2f, border color - %s, background color - %s",
                getPerimeter(a, b, c), getSquare(a, b, c), getBorderColor(), getBackgroundColor()) ;
    }
}

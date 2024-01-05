package ru.aston;

public class Rectangle implements IFigure{
    private final double a;
    private final double b;
    private final String backgroundColor;
    private final String borderColor;
    public Rectangle(double a, double b, String backgroundColor, String borderColor) {
        this.a = a;
        this.b = b;
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
        return String.format("Rectangle, perimeter - %.2f, square - %.2f, border color - %s, background color - %s",
                getPerimeter(a, b), getSquare(a, b), getBorderColor(), getBackgroundColor()) ;
    }
}

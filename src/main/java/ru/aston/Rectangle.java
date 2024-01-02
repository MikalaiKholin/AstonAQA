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

    public double getPerimeter() {
        return a + b;
    }

    public double getSquare() {
        return a * b;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public String toString(){
        return String.format("Rectangle, %s, %s, border color - %s, background color - %s",
                printPerimeter(), printSquare(), getBorderColor(), getBackgroundColor()) ;
    }
}

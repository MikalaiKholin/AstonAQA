package ru.aston;

public class Circle implements IFigure{
    private final double r;
    private final String backgroundColor;
    private final String borderColor;
    public Circle(double r, String backgroundColor, String borderColor) {
        this.r = r;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    public double getSquare() {
        return Math.PI * r * r;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public String toString(){
        return String.format("Circle, %s, %s, border color - %s, background color - %s",
                printPerimeter(), printSquare(), getBorderColor(), getBackgroundColor()) ;
    }
}

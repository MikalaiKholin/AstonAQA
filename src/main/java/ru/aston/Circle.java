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


    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public String toString(){
        return String.format("Circle, perimeter - %.2f, square - %.2f, border color - %s, background color - %s",
                getPerimeter(r), getSquare(r), getBorderColor(), getBackgroundColor()) ;
    }
}

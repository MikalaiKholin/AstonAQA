package ru.aston;

public interface IFigure {
    String getBackgroundColor();

    String getBorderColor();

    default double getPerimeter(double r){
        return 2 * Math.PI * r;
    }

    default double getPerimeter(double a, double b){
        return a + b;
    }

    default double getPerimeter(double a, double b, double c){
        return a + b + c;
    }

    default double getSquare(double r){
        return Math.PI * r * r;
    }

    default double getSquare(double a, double b){
        return a * b;
    }

    default double getSquare(double a, double b, double c){
        return Math.sqrt(getPerimeter(a, b, c) / 2 * (getPerimeter(a, b, c) / 2 - a) * (getPerimeter(a, b, c) / 2 - b) * (getPerimeter(a, b, c) / 2 - c));
    }
}

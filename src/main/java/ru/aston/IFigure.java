package ru.aston;

public interface IFigure {
    String getBackgroundColor();

    String getBorderColor();

    double getPerimeter();

    double getSquare();

    default String printPerimeter(){
        return String.format("perimeter - %.2f", getPerimeter());
    }

    default String printSquare(){
        return String.format("square - %.2f", getSquare());
    }
}

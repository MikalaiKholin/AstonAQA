package ru.aston;

public class ActionsWithColors {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public ActionsWithColors(int value) {
        this.value = value;
    }

    public void printColor() {
        if (value <= 0) System.out.println("Красный");
        if ((value > 0) && (value <= 100)) System.out.println("Желтый");
        if (value > 100) System.out.println("Зеленый");
    }
}

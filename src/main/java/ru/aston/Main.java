package ru.aston;

public class Main {
    public static void main(String[] args) {
        ActionsWithWords words = new ActionsWithWords();
        words.printThreeWords();

        ActionsWithColors colors = new ActionsWithColors(-1);
        colors.printColor();
        colors.setValue(80);
        colors.printColor();
        colors.setValue(1000);
        colors.printColor();

        ActionsWithAAndB aB = new ActionsWithAAndB(4, -5);
        aB.checkSumSign();
        aB.compareNumbers();
        aB.setA(1);
        aB.setB(3);
        aB.checkSumSign();
        aB.compareNumbers();
    }
}
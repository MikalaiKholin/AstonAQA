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
        colors.printColor(20);

        ActionsWithAAndB aB = new ActionsWithAAndB(4, -5);
        aB.checkSumSign();
        aB.compareNumbers();
        aB.setA(1);
        aB.setB(3);
        aB.checkSumSign();
        aB.compareNumbers();
        aB.checkSumSign(5, 3);
        aB.checkSumSign(-5, 3);
        aB.compareNumbers(1, 6);
        aB.compareNumbers(9, 6);
    }
}
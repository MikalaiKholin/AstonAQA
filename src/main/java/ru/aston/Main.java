package ru.aston;

public class Main {
    public static void main(String[] args) {
        ActionsWithWords.printThreeWords();

        ActionsWithColors.printColor(-80);
        ActionsWithColors.printColor(1000);
        ActionsWithColors.printColor(20);

        ActionsWithAAndB.checkSumSign(5, 3);
        ActionsWithAAndB.checkSumSign(-5, 3);
        ActionsWithAAndB.compareNumbers(1, 6);
        ActionsWithAAndB.compareNumbers(9, 6);
    }
}
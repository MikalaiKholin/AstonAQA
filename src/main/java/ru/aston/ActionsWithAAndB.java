package ru.aston;

public class ActionsWithAAndB {
    public static void checkSumSign(int a, int b) {
        System.out.println(a + b >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }

    public static void compareNumbers(int a, int b) {
        System.out.println(a >= b ? "a >= b" : "a < b");
    }
}

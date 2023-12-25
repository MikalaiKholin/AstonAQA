package ru.aston;

public class ActionsWithNumbers {
    public static boolean isSummInRange(int a, int b){
        return (((a + b) >= 10) && ((a + b) <= 20));
    }

    public static void isPositiveNumber(int number){
        System.out.println(number >= 0 ? "positive" : "negative");
    }

    public static boolean isNegativeNumber(int number){
        return (number < 0);
    }
}

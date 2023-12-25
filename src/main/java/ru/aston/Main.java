package ru.aston;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(ActionsWithNumbers.isSummInRange(1, 8));
        ActionsWithNumbers.isPositiveNumber(0);
        System.out.println(ActionsWithNumbers.isNegativeNumber(10));
        try {
            StringPrinter.printString(3, "12342314");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(ActionsWithDate.isLeapYear(80));
        System.out.println(Arrays.toString(ActionsWithArrays.valueChange(new int[] { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 })));
        System.out.println(Arrays.toString(ActionsWithArrays.createArr()));

    }
}
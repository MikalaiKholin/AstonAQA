package ru.aston;

public class StringPrinter {
    public static void printString(int n, String str) {
        if (n <= 0) System.out.println("incorrect number");
        else {
            for (int i = 0; i < n; i++) System.out.println(str);
        }

    }
}

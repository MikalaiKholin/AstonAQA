package ru.aston;

public class StringPrinter {
    public static void printString(int n, String str) throws Exception {
        if (n <= 0) throw new Exception("incorrect number");
        for (int i = 0; i < n; i++){
            System.out.println(str);
        }
    }
}

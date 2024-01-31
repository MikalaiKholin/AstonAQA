package ru.aston;

public class App {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }

    public static int factorial(int number) {
        int f = 1;
        for (int i = 1; i <= number; i++) f *= i;
        return f;
    }
}

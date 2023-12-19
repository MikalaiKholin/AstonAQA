package ru.aston;

public class ActionsWithAAndB {
    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public ActionsWithAAndB(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void checkSumSign() {
        if (a + b >= 0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }

    public void checkSumSign(int externalA, int externalB) {
        if (externalA + externalB >= 0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }

    public void compareNumbers() {
        if (a >= b) System.out.println("a >= b");
        else System.out.println("a < b");
    }

    public void compareNumbers(int externalA, int externalB) {
        if (externalA >= externalB) System.out.println("a >= b");
        else System.out.println("a < b");
    }
}

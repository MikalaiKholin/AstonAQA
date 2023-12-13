public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
    }

    public static void printThreeWords() {
        System.out.printf("Orange%nBanana%nApple%n");
    }

    public static void checkSumSign() {
        int a = 3;
        int b = 4;
        if ( a + b >= 0) System.out.println("Сумма положительная");
            else System.out.println("Сумма отрицательная");
    }

    public static void printColor() {
        int value = 1000;
        if ( value <= 0) System.out.println("Красный");
        if ( (value > 0) && (value <= 100)) System.out.println("Желтый");
        if ( value > 100) System.out.println("Зеленый");
    }
}
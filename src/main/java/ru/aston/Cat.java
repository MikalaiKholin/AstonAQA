package ru.aston;

public class Cat extends Animal {
    private static final int RUN_DISTANCE = 200;
    private static final int SWIM_DISTANCE = 0;
    private static int countOfCats = 0;

    public Cat(String name, int appetite) {
        super(name, RUN_DISTANCE, SWIM_DISTANCE, appetite);
        countOfCats++;
    }

    public static int getCountOfCats() {
        return countOfCats;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cats can't swim");
    }

    public void theStateOfSatiety() {
        System.out.printf("The %s is %s%n", super.getName(), getSatiety() ? "satiety" : "hungry");
    }
}

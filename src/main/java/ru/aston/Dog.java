package ru.aston;

public class Dog extends Animal {
    private static final int RUN_DISTANCE = 500;
    private static final int SWIM_DISTANCE = 10;
    private static int countOfDogs = 0;

    public Dog(String name, int appetite) {
        super(name, RUN_DISTANCE, SWIM_DISTANCE, appetite);
        countOfDogs++;
    }

    public static int getCountOfDogs() {
        return countOfDogs;
    }
}

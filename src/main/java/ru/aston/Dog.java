package ru.aston;

public class Dog extends Animal{
    private static int countOfDogs = 0;
    private static final int RUN_DISTANCE = 500;
    private static final int SWIM_DISTANCE = 10;

    public static int getCountOfDogs() {
        return countOfDogs;
    }

    public Dog(String name) {
        super(name, RUN_DISTANCE, SWIM_DISTANCE);
        countOfDogs++;
    }
}

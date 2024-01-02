package ru.aston;

public class Cat extends Animal {
    private static int countOfCats = 0;
    private static final int RUN_DISTANCE = 200;
    private static final int SWIM_DISTANCE = 0;

    public static int getCountOfCats() {
        return countOfCats;
    }

    public Cat(String name) {
        super(name, RUN_DISTANCE, SWIM_DISTANCE);
        countOfCats++;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cats can't swim");
    }

}

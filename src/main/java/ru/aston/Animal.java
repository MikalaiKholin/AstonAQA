package ru.aston;

public abstract class Animal {
    private static int countOfAnimals = 0;

    private final String name;
    private final int runDistance;
    private final int swimDistance;

    public static int getCountOfAnimals() {
        return countOfAnimals;
    }

    public Animal(String name, int runDistance, int swimDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        countOfAnimals++;
    }

    public void run(int distance){
        if (runDistance >= distance) System.out.printf("%s ran %d meters%n", name, distance);
        else System.out.println("The distance is too long");
    }

    public void swim(int distance) {
        if (swimDistance >= distance) System.out.printf("%s swim %d meters%n", name, distance);
        else System.out.println("The distance is too long");
    }
}

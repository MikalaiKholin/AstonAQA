package ru.aston;

public abstract class Animal {
    private static int countOfAnimals = 0;

    private final String name;
    private final int runDistance;
    private final int swimDistance;
    private final int appetite;
    private boolean satiety = false;

    public Animal(String name, int runDistance, int swimDistance, int appetite) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        this.appetite = appetite;
        countOfAnimals++;
    }

    public static int getCountOfAnimals() {
        return countOfAnimals;
    }

    public String getName() {
        return name;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public void run(int distance) {
        if (runDistance >= distance) System.out.printf("%s ran %d meters%n", name, distance);
        else System.out.println("The run distance is too long");
    }

    public void swim(int distance) {
        if (swimDistance >= distance) System.out.printf("%s swim %d meters%n", name, distance);
        else System.out.println("The swim distance is too long");
    }

    public void eat(Bowl bowl) {
        if (!satiety) satiety = bowl.removeFood(appetite);
    }
}

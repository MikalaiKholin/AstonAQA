package ru.aston;

public class Cat extends Animal {
    private static int countOfCats = 0;
    private static final int RUN_DISTANCE = 200;
    private static final int SWIM_DISTANCE = 0;

    private boolean satiety = false;
    private final int appetite;

    public static int getCountOfCats() {
        return countOfCats;
    }

    public Cat(String name, int appetite) {
        super(name, RUN_DISTANCE, SWIM_DISTANCE);
        this.appetite = appetite;
        countOfCats++;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cats can't swim");
    }

    public void eat(Bowl bowl){
        if (!satiety) satiety = bowl.removeFood(appetite);
    }

    public void theStateOfSatiety(){
        System.out.printf("The %s is %s%n", super.getName(), satiety ? "satiety" : "hungry");
    }
}

package ru.aston;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Dog("Bobik", 8),
                new Cat("Murka", 3),
                new Cat("Barsik", 5)
        };
        for (Animal a : animals) {
            a.run(50);
            a.run(550);
            a.swim(10);
            a.swim(100);
        }
        System.out.printf("Number of animals is %d%n", Animal.getCountOfAnimals());
        System.out.printf("Number of dogs is %d%n", Dog.getCountOfDogs());
        System.out.printf("Number of cats is %d%n", Cat.getCountOfCats());

        Cat[] cats = new Cat[]{
                new Cat("Vasia", 6),
                new Cat("Murka", 3),
                new Cat("Barsik", 5)
        };
        Bowl bowl = new Bowl(5);
        for (Cat c : cats) {
            c.eat(bowl);
            c.theStateOfSatiety();
        }

        IFigure[] figuries = new IFigure[]{
                new Triangle(1, 3, 3, "red", "blue"),
                new Rectangle(2, 4, "green", "black"),
                new Circle(5, "white", "yellow")
        };
        for (IFigure f : figuries) System.out.println(f);
    }
}
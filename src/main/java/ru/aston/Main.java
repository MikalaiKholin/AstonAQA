package ru.aston;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Dog("Bobik"),
                new Cat("Murka"),
                new Cat("Barsik")
        };
        for(Animal a : animals){
            a.run(50);
            a.run(550);
            a.swim(10);
        }
        System.out.printf("Number of animals is %d%n", Animal.getCountOfAnimals());
        System.out.printf("Number of dogs is %d%n", Dog.getCountOfDogs());
        System.out.printf("Number of cats is %d%n", Cat.getCountOfCats());
    }
}
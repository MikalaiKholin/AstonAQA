package ru.aston;

public class Main {
    public static void main(String[] args) {
        Box<Orange> b1 = new Box<>(10);
        System.out.println(b1.addFruits(new Orange(), 5));
        System.out.println(b1.getWeight());
        System.out.println(b1.addFruits(new Orange(), 5));
        System.out.println(b1.getWeight());
        System.out.println(b1.addFruits(new Orange(), 5));
        System.out.println(b1.getWeight());

        Box<Apple> b2 = new Box<>(15);
        System.out.println(b2.addFruits(new Apple(), 15));
        System.out.println(b2.getWeight());

        System.out.println(b1.compare(b2));

        Box<Apple> b3 = new Box<>(10);
        System.out.println(b2.pourFruits(b3));
        System.out.println(b2.getWeight());
        System.out.println(b3.getWeight());

        Box<Apple> b4 = new Box<>(20);
        System.out.println(b2.pourFruits(b4));
        System.out.println(b2.getWeight());
        System.out.println(b4.getWeight());

    }
}
package ru.aston;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private final ArrayList<T> fruits = new ArrayList<>();
    private final int volume;

    public Box(int volume) {
        this.volume = volume;
    }

    public boolean addFruits(T fruit, int count) {
        if (volume >= fruits.size() + count) {
            for (int i = 0; i < count; i++) {
                fruits.add(fruit);
            }
            return true;
        }
        return false;
    }

    public float getWeight() {
        return (float) fruits.stream().mapToDouble(Fruit::getWeight).sum();
    }

    public boolean compare(Box<?> anotherBox) {
        return this.getWeight() == anotherBox.getWeight();
    }

    public boolean pourFruits(Box<T> anotherBox) {
        if (anotherBox.addFruits(fruits.get(0), fruits.size())) {
            fruits.clear();
            return true;
        }
        return false;
    }
}

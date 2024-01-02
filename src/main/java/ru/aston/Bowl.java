package ru.aston;

public class Bowl {
    private int kilogramsOfFood;

    public Bowl(int kilogramsOfFood) {
        this.kilogramsOfFood = kilogramsOfFood;
    }

    public void addFood(int kilogramsOfFood){
        this.kilogramsOfFood += kilogramsOfFood;
    }

    public boolean removeFood(int kilogramsOfFood){
        if (this.kilogramsOfFood < kilogramsOfFood) return false;
        this.kilogramsOfFood -= kilogramsOfFood;
        return true;
    }
}

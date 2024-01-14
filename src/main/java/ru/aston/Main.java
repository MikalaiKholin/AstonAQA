package ru.aston;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(ActionsWithArrays.arraySum(new String[][]{{"1", "2", "3", "4"},
                    {"2", "5", "3", "4"},
                    {"1", "2", "2", "4"},
                    {"5", "2", "3", "8"}}));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            ActionsWithArrays.arraySum(new String[][]{{"1", "2", "3"},
                    {"2", "5", "3"},
                    {"1", "2", "2"},
                    {"5", "2", "3"}});
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            ActionsWithArrays.arraySum(new String[][]{{"1", "s", "3", "4"},
                    {"2", "5", "3", "4"},
                    {"1", "2", "2", "4"},
                    {"5", "2", "3", "8"}});
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
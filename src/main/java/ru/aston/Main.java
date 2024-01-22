package ru.aston;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 9, 4, 5, 8, 3, 12, 15);
        System.out.println(ActionsWithCollections.numberOfEvenNumbers(numbers));
    }
}
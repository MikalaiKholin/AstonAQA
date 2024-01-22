package ru.aston;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 9, 4, 5, 8, 3, 12, 15);
        System.out.println(ActionsWithCollections.numberOfEvenNumbers(numbers));

        List<String> words = Arrays.asList("Highload", "High", "Load", "Highload", "High");
        String word = "High";
        System.out.println(ActionsWithCollections.numberOfWords(words, word));

        System.out.println(ActionsWithCollections.firstElement(numbers));
        System.out.println(ActionsWithCollections.lastElement(words));
        System.out.println(ActionsWithCollections.lastElement(new ArrayList<String>()));

        words = Arrays.asList("f10", "f15", "f2", "f4", "f4", "f1");
        System.out.println(ActionsWithCollections.sortList(words));

        System.out.println(Students.manAverageAge());
        System.out.println(Students.summonsToTheArmy());

        System.out.println(ActionsWithLogins.beginWithF());
    }
}
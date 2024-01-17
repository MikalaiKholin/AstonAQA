package ru.aston;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] words = new String[]{"привет", "привет", "мир", "кот", "собака", "дом", "дом", "машина", "книга", "стол", "стул", "дом", "цветок", "цветок"};

        System.out.println(Arrays.toString(ActionsWithArrays.uniqueWords(words)));

        System.out.println(Arrays.toString(ActionsWithArrays.uniqueWordsStream(words)));

        System.out.println(ActionsWithArrays.numberOfWords(words));

        PhoneBook book = new PhoneBook();
        book.add("Ivanov", "+37529888777");
        book.add("Petrov", "+37529585777");
        book.add("Sidorov", "+37529666777");
        book.add("Ivanov", "+37529111777");
        book.add("Petrov", "+37529585557");
        String name = "Petrov";
        System.out.printf("Name - %s, Phone(s) - %s%n", name, book.get(name));
    }
}
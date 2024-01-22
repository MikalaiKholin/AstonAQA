package ru.aston;

import java.util.Collections;
import java.util.List;

public class ActionsWithCollections {

    public static long numberOfEvenNumbers(List<Integer> list) {
        return list.stream().filter(n -> n % 2 == 0).count();
    }

    public static long numberOfWords(List<String> list, String word) {
        return list.stream().filter(w -> w.equals(word)).count();
    }

    public static <T> T firstElement(List<T> list) {
        return list.stream().findFirst().orElse(null);
    }

    public static <T> T lastElement(List<T> list) {
        return list.stream().reduce((first, second) -> second).orElse(null);
    }

    public static <T extends Comparable<? super T>> List<T> sortList(List<T> list) {
        Collections.sort(list);
        return list;
    }
}

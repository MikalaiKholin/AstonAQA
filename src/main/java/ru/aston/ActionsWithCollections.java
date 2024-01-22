package ru.aston;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ActionsWithCollections {

    public static long numberOfEvenNumbers(@NotNull List<Integer> list) {
        return list.stream().filter(n -> n % 2 == 0).count();
    }

    public static long numberOfWords(@NotNull List<String> list, String word) {
        return list.stream().filter(w -> w.equals(word)).count();
    }
}

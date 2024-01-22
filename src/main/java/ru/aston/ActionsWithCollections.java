package ru.aston;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.stream.Collectors;

public class ActionsWithCollections {

    public static List<Integer> numberOfEvenNumbers(@NotNull List<Integer> list) {
        return list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    }
}

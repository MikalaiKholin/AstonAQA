package ru.aston;

import java.util.*;

public class ActionsWithArrays {
    public static String[] uniqueWords(String[] words) {
        Set<String> set = new HashSet<>(Arrays.asList(words));
        return set.toArray(new String[0]);
    }

    public static Map<String, Integer> numberOfWords(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (String w : words) {
            if (map.containsKey(w)) {
                map.put(w, map.get(w) + 1);
            } else {
                map.put(w, 1);
            }
        }
        return map;
    }
}

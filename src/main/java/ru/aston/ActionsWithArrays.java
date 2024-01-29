package ru.aston;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ActionsWithArrays {
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

    public static String[] uniqueWordsStream(String[] words) {
        return new ArrayList<>(Arrays.asList(words)).stream().distinct().toArray(String[]::new);
    }
}

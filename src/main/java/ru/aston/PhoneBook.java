package ru.aston;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    Map<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String name, String phone) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phone);
        } else {
            phoneBook.put(name, new ArrayList<>());
            phoneBook.get(name).add(phone);
        }
    }

    public ArrayList<String> get(String name){
        return phoneBook.get(name);
    }
}

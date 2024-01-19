package ru.aston;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class NewPhoneBook {
    ArrayList<Person> phonebook = new ArrayList<>();

    public void add(String name, String phone) {
        phonebook.add(new Person(name, phone));
    }

    public ArrayList<String> get(String name) {
       return (ArrayList<String>) phonebook.stream().filter(p -> p.getName().equals(name)).map(p -> p.getPhone()).collect(Collectors.toList());
    }
}

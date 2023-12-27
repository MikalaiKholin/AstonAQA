package ru.aston;

public class Employee {
    private final String name;
    private final Position position;
    private final String email;
    private final String phone;
    private final double salary;
    private final int age;

    public Employee(String name, Position position, String email, String phone, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String toString(){
        return (String.format("Name - %s; Position - %s; Email - %s; Phone - %s; Salary - %.2f; Age - %d",
                name, position, email, phone, salary, age));
    }

}

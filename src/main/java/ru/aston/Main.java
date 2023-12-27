package ru.aston;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
            new Employee("Ivan", Position.JUNIOR, "Ivan@gmail.com", "+375338877664", 700, 33),
            new Employee("Ira", Position.JUNIOR, "Ira@gmail.com", "+375334537664", 700, 33),
            new Employee("Serhey", Position.MIDDLE, "Serhey@gmail.com", "+37456877664", 900, 25),
            new Employee("Anna", Position.SENIOR, "Anna@gmail.com", "+37565877664", 1200, 33),
            new Employee("Vasia", Position.SENIOR, "Vasian@gmail.com", "+375344337664", 1200, 33)
        };
        for (Employee e : employees) System.out.println(e);

        System.out.println();

        Park.Attraction[] attractions = new Park.Attraction[]{
                new Park.Attraction("ferris wheel", "10:00-22:00", 10),
                new Park.Attraction("carousel", "10:00-22:00", 8),
        };
        for (Park.Attraction a : attractions) System.out.println(a);
    }
}
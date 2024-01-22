package ru.aston;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Students {
    static Collection<Student> students = Arrays.asList(new Student("Dmitry", 17, Gender.MAN),
            new Student("Maxim", 20, Gender.MAN),
            new Student("Ekaterina", 20, Gender.WOMAN),
            new Student("Mihail", 28, Gender.MAN));

    private enum Gender {
        MAN, WOMAN
    }

    private static class Student {
        private final String name;
        private final Integer age;
        private final Gender gender;

        public Student(String name, Integer age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) && Objects.equals(age, student.age) && Objects.equals(gender, student.gender);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, gender);
        }

        @Override
        public String toString() {
            return String.format("{name = %s, age = %d, gender = %s}", name, age, gender);
        }
    }

    public static double manAverageAge () {
        return students.stream().filter(s -> s.getGender().equals(Gender.MAN)).mapToDouble(Student::getAge).summaryStatistics().getAverage();
    }

    public static List<Student> summonsToTheArmy () {
        return students.stream().filter(s -> s.getGender().equals(Gender.MAN)).filter(s -> s.getAge() <= 27).collect(Collectors.toList());
    }
}

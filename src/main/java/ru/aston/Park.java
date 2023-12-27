package ru.aston;

public class Park {
    public static class Attraction{
        private final String name;
        private final String workingHours;
        private final double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public String toString(){
            return (String.format("Name - %s; Working Hours - %s; Price - %.2f",
                    name, workingHours, price));
        }
    }
}

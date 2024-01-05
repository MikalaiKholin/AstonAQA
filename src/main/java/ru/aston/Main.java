package ru.aston;

public class Main {
    public static void main(String[] args) {
        AppData data = new AppData(new String[]{"aaa", "bbb", "ccc", "ddd"}, new int[][]{{5,7,3,17}, {7,0,1,12}, {8,1,2,3}});
        data.writeData();
        data.readData();
    }
}
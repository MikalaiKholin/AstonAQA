package ru.aston;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AppData {
    private String[] header;
    private final int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public void writeData(){
        String head = (Arrays.toString(header)).replace(',', ';').replace("[", "").replace("]","");
        writeString(head, false);
        for (int[] d : data){
            String dataLine = (Arrays.toString(d)).replace(',', ';').replace("[", "").replace("]","");
            writeString(dataLine, true);
        }
    }

    public void writeString(String str, boolean append){
        try {
            FileWriter writer = new FileWriter("src/main/resources/data.csv", append);
            writer.write("\n");
            writer.write(str);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readData(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/data.csv"));
            String line = reader.readLine();
            System.out.println(line);
            header = line.split("; ");
            int i = 0;
            while (line != null) {
                System.out.println(line);
                data[i] = Arrays.stream(line.split("; ")).mapToInt(Integer::parseInt).toArray();
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

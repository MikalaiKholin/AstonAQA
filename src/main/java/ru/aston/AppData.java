package ru.aston;

import java.io.*;
import java.util.ArrayList;
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
            writeString("\n", true);
            writeString(dataLine, true);
        }
    }

    public void writeString(String str, boolean append){
        try {
            FileWriter writer = new FileWriter("src/main/resources/data.csv", append);
            writer.write(str);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readData(){
        ArrayList<String> lines = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/data.csv"));
            String line = reader.readLine();
            while (line != null) {
                lines.add(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        header = lines.get(0).split("; ");
        for (int i = 1; i < lines.size(); i++) data[i-1] = Arrays.stream(lines.get(i).split("; ")).mapToInt(Integer::parseInt).toArray();
    }
}

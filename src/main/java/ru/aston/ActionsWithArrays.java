package ru.aston;

public class ActionsWithArrays {
    public static int[] valueChange(int[] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i] == 1 ? 0 : 1;
        }
        return arr;
    }

    public static int[] createArr(){
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }
        return arr;
    }
}

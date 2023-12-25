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

    public static int[] createArr(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }

    public static int[] valueMultiplication(int[] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i] < 6 ? arr[i] * 2 : arr[i];
        }
        return arr;
    }

    public static int[][] diagonals(int size){
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                arr[i][j] = ((i == j) || (size - i == j + 1)) ? 1 : 0;
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        return arr;
    }
}

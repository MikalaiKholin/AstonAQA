package ru.aston;

public class ActionsWithArrays {
    public static int arraySum(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != arr[0].length || arr.length != 4) throw new MyArraySizeException("invalid array size");
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                try {
                    summ += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    String m = String.format("Invalid symbols at line %d, column %d", i + 1, j + 1);
                    throw new MyArrayDataException(m);
                }
            }
        }
        return summ;
    }
}

package Belajar.apalah;

import java.util.Arrays;

public class LatihanArray {
    public static void main(String[] args) {
        
        int[] arrayAngka1 = {1,2,3,4,5,6,7,8,9};
        int[] arrayAngka2 = {0,1,2,4,5,6,7,8,9};

        // penjualan antara duah buah array

        int[] arrayHasil1 = tambahArray(arrayAngka1, arrayAngka2);
        printArray(arrayAngka1, "Array 1");
        printArray(arrayAngka2, "Array 2");
        printArray(arrayHasil1, "HAsilnya");
        System.out.println();
        
        // menggabungkan duah buah array
        int[] arrayHasil2 = new int[arrayAngka1.length + arrayAngka2.length];
        
        for (int i=0; i < arrayAngka1.length; i++){
            arrayHasil2[i] = arrayAngka1[i];
        }

        for (int i=0; i < arrayAngka2.length; i++){
            arrayHasil2[i + arrayAngka1.length] = arrayAngka2[i];
        }
        printArray(arrayAngka1, "Array 1");
        printArray(arrayAngka2, "Array 2");
        printArray(arrayHasil2, "HAsilnya");
    }
    




    private static int[] tambahArray (int[] arrayInt1, int[] arrayInt2) {
        
        int[] arrayHasil = new int[arrayInt1.length];
        for (int i = 0; i < arrayInt1.length; i++) {
            arrayHasil[i] = arrayInt1[i] + arrayInt2[i];
        }
        return arrayHasil;
    }

    private static void printArray(int[] dataArray, String message){
        System.out.println("array" + message+ " = " + Arrays.toString(dataArray));
    }
}

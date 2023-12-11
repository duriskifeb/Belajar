package Belajar.Oop_ya;

import java.util.Arrays;

public class LatihanArray {
    public static void main(String[] args) {
        
        //  penjumlahan antara dua array
        int[] arrayAngka1 = {1,2,3,4,5,6,7,8,9};
        int[] arrayAngka2 = {1,2,3,4,5,6,7,8,9};
        
        int[] arrayHasil = new int[arrayAngka1.length];
        for (int i = 0; i < arrayAngka1.length; i++){
            arrayAngka1[i] = arrayAngka1[i] + arrayAngka2[i];

        }
        printArray(arrayAngka1, "array satu : ");
        printArray(arrayAngka2, "array dua : ");
        System.out.println();
        printArray(arrayHasil, "hasilnya : ");


    }

    private static void printArray(int[] dataArray, String message){
        System.out.println(" array " + message + Arrays.toString(dataArray));
    }
}

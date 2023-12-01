package Belajar.apalah;

import java.util.Arrays;
import java.util.Scanner;

public class Serius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        

        int[] arrayAngka1 = {1,2,3,4,5,6,7,8,9};
        int[] arrayAngka2 = {1,2,3,4,5,6,7,8,9};

        int[] arrayHasil = new int[arrayAngka1.length];
        for (int i = 0; i < arrayAngka1.length; i++) {
            arrayAngka1[i] = arrayAngka1[i] + arrayAngka2[i];

        }
        printArray(arrayAngka1, "array 1");
        printArray(arrayAngka1, "array 1");
        printArray(arrayHasil, "Hasil");



        

    }

    private static void printArray(int[] dataArray, String message) {
        System.out.println(message + " = " + Arrays.toString(dataArray));
    }
}

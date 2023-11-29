package Belajar.apalah;

import java.util.Arrays;
import java.util.Scanner;

public class arayGabung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arrayAngka1 = {12,12,43,54,57,69,67,48,39};
        int[] arrayAngka2 = {0,2,3,4,5,6,7,8,9};

        int[] deklarasi = new int[5];

        int[] arrayHassil1 = new int[arrayAngka1.length + arrayAngka2.length];

        for (int i=0; i < arrayAngka1.length; i++) {
            if (i <= arrayAngka1.length-1) arrayHassil1[i] = arrayAngka1[i] ;             
        } 
        for (int i=0; i < arrayAngka2.length; i++) {
            if (i <= arrayAngka2.length-1) arrayHassil1[i+arrayAngka1.length] = arrayAngka2[i] ;             
        } 

        printArray(arrayAngka1, "array 1 : ");
        printArray(arrayAngka2, "array 2 : ");
        printArray(arrayHassil1, "hasil 1 : ");
        printArray(deklarasi, "dekl : ");
        // printArray(arrayHassil1, "hasil 2 : ");

        // part 2 
        // int[] arrayHassil2 = new int[arrayAngka1.length + arrayAngka2.length];

        
        // for (int i = 0; i < arrayAngka1.length; i++) {
        //     arrayHassil2[i] = arrayAngka1[i];
        // }

        // for (int i = 0; i < arrayAngka2.length; i++) {
        //     arrayHassil2[i + arrayAngka1.length] = arrayAngka2[i];
        // }
        
    }

    private static int[] tambahArray (int[] arrayInt1, int[] arrayInt2){
        int[] arrayHassil = new int[arrayInt1.length + arrayInt2.length];
        for (int i = 0; i < arrayInt1.length + arrayInt2.length; i++){
            arrayHassil[i] = arrayInt1[i];
            arrayHassil[i + arrayInt1.length - 1] = arrayInt2[i];
            
        }
        return arrayHassil;
        
    }

    public static void printArray(int[] dataArray, String message ) {
        System.out.println(message + " = " + Arrays.toString(dataArray));

    }
}

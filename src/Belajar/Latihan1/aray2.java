package Belajar.Latihan1;

import java.util.Arrays;

public class aray2 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(" Belajar array 2 dimensi ya :) ");

        // cara membuat array dua dimensi assigmnet
        int[][] array2mensi = {
            {1,2},
            {3,4},
        };
        
        printArray2D(array2mensi);

        // array 2 dimensi dengan deklarasi
        int[][] arrayAngka = new int[5][4];

        printArray2D(arrayAngka);
        System.out.println();

        // // looping lengkap secara manual
        // for(int i = 0; i < arrayAngka.length; i++) {
        //     System.out.print("[");
        //     for(int j = 0; j < arrayAngka[i].length; j++) {
        //         System.out.print(arrayAngka[i][j] + " , ");
        //     }
        //     System.out.print("]\n");
        // }
        
        // System.out.println();
        // // looping pakai for each
        // for (int[] baris: arrayAngka) {
        //     System.out.print("[");
        //     for(int angka: baris) {
        //         System.out.print(angka + ",");
        //     }
        //     System.out.print("]\n");
        // }

        int[][] array_2D_2 = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
        };
        
        printArray2D(array_2D_2);

        int[][] array_ranged = {
            {1,2,3,4,5},
            {6,7,8,9,10,11,12},
            {1},
        };
        printArray2D(array_ranged);
        
    }
    private static void printArray2D (int[][] dataArray) {
        System.out.print("\n");
        for (int[] baris: dataArray) {
            System.out.print("[");
            for(int angka: baris) {
                System.out.print(angka + ",");
            }
            System.out.print("]\n");
        }
        
    }
}

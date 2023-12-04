package Belajar.apalah;

import java.util.Arrays;

public class array2mensi {
    public static void main(String[] args) {
        
        // yang ke 1
        int[][] matrix_a = {
            
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5},

        };

        // yang ke 2
        int[][] matrix_b = {
            
            {11, 12, 13, 14, 15},
            {13, 42, 33, 24, 35},
            {11, 22, 33, 24, 25},

        };
        
        printArray(matrix_a);
        printArray(matrix_b);
        
        int baris_a = matrix_a.length;
        int kolom_a = matrix_a.length;

        int[][] hasil = new int [baris_a][kolom_a];
        for (int i = 0; i < baris_a; i++) {
            for (int j = 0; i < baris_a; j++) {
                hasil[i][j] = matrix_a[i][j] + matrix_b[i][j];
            }
        }
    }

    private static void printArray(int[][] dataArray) {
        int baris = dataArray.length;
        int kolom = dataArray[0].length;

        for(int i = 0; i < baris; i++) {
            System.out.print("[");
            for (int j = 0; j < kolom; j++) {
                System.out.print(dataArray[i][j]);

                if (j < (kolom - 1)) {
                    System.out.print(",");
                }else {
                    System.out.print("]");
                }

                
            }
            System.out.println("\n");
        }
    }
}

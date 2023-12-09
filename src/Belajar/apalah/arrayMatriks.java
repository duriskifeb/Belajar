package Belajar.apalah;

import java.util.Scanner;

public class arrayMatriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("============================================");
        System.out.println("|  Program Java Input Matriks 2 Dimensi    |");
        System.out.println("============================================");
        System.out.println();
        
        int[][] matriks = new int[100][100];
        int jum_baris, jum_kolom, i, j;

        System.out.print("Input jumlah baris matriks: ");
        jum_baris = input.nextInt();

        System.out.print("Input jumlah kolom matriks: ");
        jum_kolom = input.nextInt();
        System.out.println();

        // proses input array
        for (i = 0; i < jum_baris; i++) {
            for (j = 0; j < jum_kolom; j++) {
                System.out.print("Baris " + (i + 1) + ", kolom " + (j + 1) + " = ");
                matriks[i][j] = input.nextInt();
            }
            System.out.println();
        }

        System.out.println("Hasil matriks: ");

        // menampilkan array
        for (i = 0; i < jum_baris; i++) {
            for (j = 0; j < jum_kolom; j++) {
                System.out.print(String.format("%3d", matriks[i][j]) + " ");
            }
            System.out.println();

        }
        System.out.println();
        System.out.println("============================================");
        System.out.println("| Terimakasih telah menggunakan app kami   |");
        System.out.println("============================================");
        System.out.println();
        System.out.println("                      :)            ");
        System.out.println();
        
    }
}

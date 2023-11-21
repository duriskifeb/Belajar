package Belajar.apalah;

import java.util.Scanner;

public class arayTambah {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("--o0  Program Java Penjumlahan Array  0o--");
        System.out.println("==========================================");
        System.out.println();

        int[] arr = new int[100];
        int arr_count, i, total;

        System.out.print("Input jumlah element array: ");
        arr_count = input.nextInt();
        System.out.println();

        System.out.println("Input " + arr_count +
            " angka (dipisah dengan enter):");

        total = 0;
        for (i = 0; i < arr_count; i++) {
          System.out.print("Angka ke-" + (i + 1) + ": ");
          arr[i] = input.nextInt();
          total = total + arr[i];
        }

        System.out.println();

        System.out.println("Total penjumlahan dari " + arr_count +
            " angka tersebut adalah: " + total);
    }
}

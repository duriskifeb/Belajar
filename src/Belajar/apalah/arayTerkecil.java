package Belajar.apalah;

import java.util.Scanner;

public class arayTerkecil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("============================================");
        System.out.println("--o0  Program Java Cari Nilai Terkecil  0o--");
        System.out.println("============================================");
        System.out.println();

        int[] arr = new int[100];
        int arr_count, i, min_num;

        System.out.print("Input jumlah element array: ");
        arr_count = input.nextInt();

        System.out.println("Input " + arr_count + " angka (dipisah dengan enter):");

        // simpan setiap angka yang diinput ke dalam array
        for (i = 0; i < arr_count; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println();

        min_num = arr[0];
        // proses mencari nilai terkecil
        for (i = 0; i < arr_count; i++) {
            if (arr[i] < min_num) {
                min_num = arr[i];
            }
        }

        System.out.println("Angka terkecil adalah: " + min_num);
    }
}

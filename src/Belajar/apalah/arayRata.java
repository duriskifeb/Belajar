package Belajar.apalah;

import java.util.Scanner;

public class arayRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("--o0  Program Java Cari Nilai Rata-rata  0o--");
        System.out.println("=============================================");
        System.out.println();

        int[] arr = new int[100];
        int arr_count, i;
        float total, rata2;

        System.out.print("Input jumlah element array: ");
        arr_count = input.nextInt();

        System.out.println("Input " + arr_count + " angka (dipisah dengan enter):");

        // simpan setiap angka yang diinput ke dalam array
        for (i = 0; i < arr_count; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println();

        // cari total semua element array
        total = 0;
        for (i = 0; i < arr_count; i++) {
            total = total + arr[i];
        }

        // hitung nilai rata-rata
        rata2 = (total / arr_count);
        System.out.println("Nilai rata-rata dari " + arr_count +
                " inputan adalah: " + rata2);
        
    }
}

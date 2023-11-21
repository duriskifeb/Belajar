package Belajar.apalah;

import java.util.Scanner;

public class arayCarilah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("--o0  Program Java Pencarian Array  0o--");
        System.out.println("========================================");
        System.out.println();

        int[] arr = new int[100];
        int arr_count, i, num;

        System.out.print("Input jumlah element Array: ");
        arr_count = input.nextInt();

        System.out.print("Input " + arr_count + " angka (dipisah dengan enter): ");
        System.out.println();
        System.out.println();

        // simpan setiap angka yang diinput ke dalam array
        for (i = 0; i < arr_count; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println();

        System.out.print("Input angka yang akan dicari: ");
        num = input.nextInt();

        // proses pencarian array
        for (i = 0; i < arr_count; i++) {
            if (arr[i] == num) {
                System.out.print("Angka ditemukan pada index ke-" + i);
                break;
            }
        }

        if (i == arr_count) {
            System.out.print("Angka tidak ditemukan");
        }

        System.out.println();
    }
}

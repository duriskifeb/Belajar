package Project1.RevisiProject.JanganBesar;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import Belajar.apalah.konser;
import Project1.TugasBesar.LebihBesar.Tubes;

import Project1.RevisiProject.JanganBesar.*;

class Concert {
    private int availableTickets;

    public Concert(int initialTickets) {
        this.availableTickets = initialTickets;
    }

    public int getAvailableTickets() {
        return availableTickets;
    }

    public void increaseTickets(int amount) {
        if (amount > 0) {
            availableTickets += amount;
            System.out.println(amount + " tiket ditambahkan. Total tiket adalah: " + availableTickets);
        } else {
            System.out.println("Input tidak valid.");
        }
    }

    public void decreaseTickets(int amount) {
        if (amount > 0 && amount <= availableTickets) {
            availableTickets -= amount;
            System.out.println(amount + " tiket dihapus. Total tiket yang tersedia: " + availableTickets);
        } else {
            System.out.println("Jumlah tiket yang akan dihapus tidak valid atau tiket yang tersedia tidak mencukupi.");
        }
    }
}

public class Data {

    // ini buat user yaa...
    public static void showMenuAdmin() {
        Jalankan.displayAdminMenu();
        System.out.println("\n[ Login Berhasil. . .]\n");
        System.out.println("\n--o0 Selamat datang di Ademin 0o--\n");

        Concert concert = new Concert(50); // Jumlah Tiket Awal
        
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            System.out.println("1. Tambahkan Tiket");
            System.out.println("2. Kurangi Tiket");
            System.out.println("3. Cek Tiket Yang Tersedia");
            System.out.println("4. Keluar\n");
            System.out.print("Pilih Salah Satu Menu: ");
            int choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println("Nama - nama konser : ");
                    System.out.print("Masukkan Nomor Untuk Menambah Jumlah Tiket : ");
                    int addTickets = scanner.nextInt();
                    concert.increaseTickets(addTickets);
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Masukkan Nomor Untuk Mengurangi Jumlah Tiket: ");
                    int removeTickets = scanner.nextInt();
                    concert.decreaseTickets(removeTickets);
                    break;

                case 3:
                    System.out.println("\nTiket Yang Tersedia : " + concert.getAvailableTickets());
                    break;

                case 4:
                loop = false;
                    // System.out.print("Sedang keluar...");

                    // // Implementasi loading sebelum keluar
                    // for (int i = 0; i < 5; i++) {
                    //     try {
                    //         Thread.sleep(1000); // Menunggu 0.5 detik
                    //         System.out.print(".");
                    //     } catch (InterruptedException e) {
                    //         e.printStackTrace();
                    //     }
                    // }

                    // // Menampilkan pesan selesai keluar
                    // System.out.println("\nTerima kasih. Selamat tinggal - Sampai jumpa kembali :) ");
                    // CloseAPK();
                    // System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan Invalid, Silahkan Pilih Option Yang Ada.");
                    scanner.close();
            }
        }
    }

    public static void showMenuCustomer() {
        
    }
    
    public static void CloseAPK() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        } catch (Exception e) {
            System.err.println("Terjadi kesalahan: " + e);
        }

    }

}

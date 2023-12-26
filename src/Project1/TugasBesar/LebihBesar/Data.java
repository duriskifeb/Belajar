package Project1.TugasBesar.LebihBesar;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Data {

    // ini buat user yaa...
    public static void showMenuAdmin() {
        Tubes.displayAdminMenu();
        System.out.println("\n[ Login Berhasil. . .]\n");
        System.out.println("\n--o0 Selamat datang di Ademin 0o--\n");

        Concert concert = new Concert(50); // Jumlah Tiket Awal

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Tambahkan Tiket");
            System.out.println("2. Kurangi Tiket");
            System.out.println("3. Cek Tiket Yang Tersedia");
            System.out.println("4. Keluar\n");
            System.out.print("Pilih Salah Satu Menu: ");
            int choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
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
                    System.out.println("Mengeluarkan.....");
                    System.exit(0);

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

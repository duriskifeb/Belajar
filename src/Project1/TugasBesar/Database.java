package Project1.TugasBesar;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Database {

    // ini buat user yaa...
    public static void showMenu2() {
        Main.displayAdminMenu();
        System.out.println("\nAdmin Menu : \n");

        ademin concert = new ademin(50); // Jumlah Tiket Awal

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Tambahkan Tiket");
            System.out.println("2. Kurangi Tiket");
            System.out.println("3. Cek Tiket Yang Tersedia");
            System.out.println("4. Keluar");

            System.out.print("\nPilih Salah Satu Menu : ");
            int choice = scanner.nextInt();
            System.out.println();

            int ulangi;

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Nomor Untuk Menambah Jumlah Tiket: ");
                    int addTickets = scanner.nextInt();
                    concert.increaseTickets(addTickets);
                    break;

                case 2:
                    System.out.print("Masukkan Nomor Untuk Mengurangi Jumlah Tiket: ");
                    int removeTickets = scanner.nextInt();
                    concert.decreaseTickets(removeTickets);
                    break;

                case 3:
                    System.out.println("Tiket Yang Tersedia : " + concert.getAvailableTickets());
                    System.out.println("\t| NO |              NAMA KONSER                       | Jumlah Tiket |");
                    System.out.println("\t______________________________________________________________________");
                    System.out.println("\t|  1 | Tulus - Album Manusia                          |      10      |");
                    System.out.println("\t|  2 | Coldplay - Tour in Jakarta / Indonesia         |      10      |");
                    System.out.println("\t|  3 | Jkt 48 - 12 Tahun Aniversary jkt di Surabaya   |      10      |");
                    System.out.println("\t|  4 | 30 Tahun Berkarya Tour Concert - Surabaya      |      10      |");
                    System.out.println("\t|  5 | BTS Live Trilogy III The WINGS Tour in Jakarta |      10      |");
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Mengeluarkan.....");
                    
                    CloseAPK();
                    try {
                        // Introduce a delay before exiting (e.g., 3 seconds)
                        System.out.println("Loading . . .");
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Terimaksih anda telah menggunakan APK kami. :) ");
                    System.exit(0);
                    break;

                default:
                    System.err.println("Maaf... Pilihan anda tidak ada pilih [1 - 4] : ");
                    System.out.println();
                    break;
            }
        }
    }

    public static void CloseAPK() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        } catch (Exception e) {
            System.err.println("Terjadi kesalahan: " + e);
        }

    }

}

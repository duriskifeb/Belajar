package Project1.TugasBesar;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Database {

    // ini buat user yaa...
    public static void showMenuAdmin() {
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

    public static void showMenuCustomer() {
        Scanner input = new Scanner(System.in);
        Main.displayAdminMenu();
        // int pilihan = 0;
        boolean pilihan = true;
        boolean yakin = true;
        String pilihanUser;

        while (pilihan) {
            clearScreen();
            System.out.println("\nMenu customer : ");
            System.out.println("1. Lihat jadwal event Konser");
            System.out.println("2. beli Tiket Konser");
            System.out.println("3. Lihat riwayat pembelian Tiket Konser");
            System.out.println("0. Menutup Aplikasi");

            System.out.print("\nPilihan anda :");
            pilihanUser = input.nextLine();

            switch (pilihanUser) {
                case "1":
                    System.out.println("1. Lihat jadwal event Konser\n");
                    showJadwalKonser();
                    break;
                case "2":
                    System.out.println("2. Beli Tiket konser");
                    //beli tikeet disini dulu 
                    break;
                case "3":
                    System.out.println("3. Lihat riwayat pembelian Tiket Konser");
                    // riwayat pembelian tiket
                    break;
                case "0":
                    System.out.println("0. Menutup Aplikasi");
                    CloseAPK();
                    System.exit(0);
                    break;

                default:
                    System.err.println("Maaf... Pilihan anda tidak ada pilih [1 - 2]");
                    break;
            }

            yakin = getYesorNo("Apakah anda ingin melanjutkan.?");
        }

    }

    public static void showJadwalKonser() {
        Scanner konseran = new Scanner(System.in);
        boolean pilihanmu = true;
        String pilihanU;
        boolean miliho = true;

        while (miliho) {
            System.out.println("Jadwal Konser yang akan hadir :\n");
            System.out.println("1. Tulus - Album Manusia ");
            System.out.println("2. Coldplay - Tour in Jakarta / Indonesia - ");
            System.out.println("3. Jkt 48 - 12 Tahun Aniversary jkt di Surabaya - ");
            System.out.println("4. 30 Tahun Berkarya Tour Concert - Surabaya ");
            System.out.println("5. BTS Live Trilogy III The WINGS Tour in Jakarta ");
            System.out.println("0. Tidak ingin melihat jadwal konser\n");

            System.out.print("Pilihan anda : ");
            pilihanU = konseran.nextLine();
            System.out.println();

            switch (pilihanU) {
                case "1":
                    System.out.println();
                    System.out.println("          ---o0<o>0o---");
                    System.out.println("     |---------------------| ");
                    System.out.println("     |Tulus - Album Manusia|");
                    System.out.println("     |---------------------| ");
                    System.out.println("_____|_____________________|_____");
                    System.out.println("|Tempat : Bandung\t\t|");
                    System.out.println("|Waktu  : 7 Januari 2024\t|");
                    System.out.println("|jumlah Ticket : 100\t\t|");
                    System.out.println("|_______________________________|");
                    break;
                case "2":
                    System.out.println();
                    System.out.println("                  ---o0<o>0o---");
                    System.out.println("     |--------------------------------------| ");
                    System.out.println("     |Coldplay - Tour in Jakarta / Indonesia|");
                    System.out.println("     |--------------------------------------| ");
                    System.out.println("_____|______________________________________|_____");
                    System.out.println("|Tempat : Bandung\t\t\t\t |");
                    System.out.println("|Waktu  : 7 Januari 2024\t\t         |");
                    System.out.println("|jumlah Ticket : 100\t\t\t\t |");
                    System.out.println("|________________________________________________|");
                    break;
                case "3":
                    System.out.println();
                    System.out.println("                  ---o0<o>0o---");
                    System.out.println("     |--------------------------------------| ");
                    System.out.println("     |Coldplay - Tour in Jakarta / Indonesia|");
                    System.out.println("     |--------------------------------------| ");
                    System.out.println("_____|______________________________________|_____");
                    System.out.println("|Tempat : Bandung\t\t\t\t |");
                    System.out.println("|Waktu  : 7 Januari 2024\t\t         |");
                    System.out.println("|jumlah Ticket : 100\t\t\t\t |");
                    System.out.println("|________________________________________________|");
                    break;
                case "4":
                    System.out.println();
                    System.out.println("                  ---o0<o>0o---");
                    System.out.println("     |--------------------------------------| ");
                    System.out.println("     |Coldplay - Tour in Jakarta / Indonesia|");
                    System.out.println("     |--------------------------------------| ");
                    System.out.println("_____|______________________________________|_____");
                    System.out.println("|Tempat : Bandung\t\t\t\t |");
                    System.out.println("|Waktu  : 7 Januari 2024\t\t         |");
                    System.out.println("|jumlah Ticket : 100\t\t\t\t |");
                    System.out.println("|________________________________________________|");
                    break;
                case "5":
                    System.out.println();
                    System.out.println("                  ---o0<o>0o---");
                    System.out.println("     |--------------------------------------| ");
                    System.out.println("     |Coldplay - Tour in Jakarta / Indonesia|");
                    System.out.println("     |--------------------------------------| ");
                    System.out.println("_____|______________________________________|_____");
                    System.out.println("|Tempat : Bandung\t\t\t\t |");
                    System.out.println("|Waktu  : 7 Januari 2024\t\t         |");
                    System.out.println("|jumlah Ticket : 100\t\t\t\t |");
                    System.out.println("|________________________________________________|");
                    break;
                case "0":
                    System.out.println("gajadi LIhat tiket, karena masih belum punya uang..!!");
                    miliho = getYesorNo("Apakah anda ingin melihat tiket yang lain :");
                    break;

                default:
                    System.err.println("Maaf pilihan anda tidak ada.!");
                    break;

            }

            break;
        }
    }

    public static void CloseAPK() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        } catch (Exception e) {
            System.err.println("Terjadi kesalahan: " + e);
        }

    }

    private static boolean getYesorNo(String messeage) {

        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\n" + messeage + " [y/n] : ");
        String pilihanUser = terminalInput.next();
        while (!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")) {

            System.err.println("Maaf pilihan ana bukan y dan n");
            System.out.print("\n" + messeage + " [y/n] : ");
            pilihanUser = terminalInput.next();
        }

        return pilihanUser.equalsIgnoreCase("y");
    }

    private static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (Exception ex) {
            System.err.println("tidak bisa clear screen");
        }
    }





}

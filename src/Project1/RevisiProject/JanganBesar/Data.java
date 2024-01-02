package Project1.RevisiProject.JanganBesar;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

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
    public void showMenuAdmin(ArrayList<Konser> daftarKonser) {
    ArrayList<Konser> dk = daftarKonser;
    

        Jalankan.displayAdminMenu();
        System.out.println("\n--o0 Selamat datang di Ademin 0o--\n");

        Concert concert = new Concert(0); // Jumlah Tiket Awal
        
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            System.out.println("1. Tambahkan Tiket");
            System.out.println("2. Kurangi Tiket");
            System.out.println("3. Cek Tiket Yang Tersedia");
            System.out.println("4. Logout");
            System.out.println("0. Keluar dari aplikasi\n");
            System.out.print("Pilih Salah Satu Menu: ");
            int choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Nomor Untuk Menambah Jumlah Tiket : ");
                    int addTickets = scanner.nextInt();
                    System.out.println();
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
                    for(int i = 0; i<dk.size();i++){
                        System.out.println(dk.get(i).getNamaKonser());
                        for(int j = 0; j < dk.get(i).getDaftarTiket().size(); j++){
                            // System.out.println();
                            System.out.print(dk.get(i). getDaftarTiket().get(j).getJenis() + " Jumlah Tiket: "+  +dk.get(i).getDaftarTiket().get(j).getJumlah());
                            System.out.println();
                            System.out.println();
                        }
                    }
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
                    break;
                    case 0 :
                    System.out.print("sedang menutup aplikasi ");
                    loadingMessage();
                    CloseAPK();
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

    public static void loadingMessage() {
        try {
            // Simulate loading by printing dots with a delay
            for (int i = 0; i < 3; i++) {
                System.out.print(".");
                Thread.sleep(500); // Sleep for 1 second
            }
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}

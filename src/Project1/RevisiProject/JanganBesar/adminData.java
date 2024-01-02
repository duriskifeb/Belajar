package Project1.RevisiProject.JanganBesar;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

// import Project1.TugasBesar.LebihBesar.Tubes;

// import Project1.RevisiProject.JanganBesar.*;

class Concert {
    private int availableTickets;

    public Concert(int jumlah) {
        this.availableTickets = jumlah;
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

public class adminData {

    // ini buat user yaa...
    public static void showMenuAdmin() {
        Jalankan.displayAdminMenu();
        System.out.println("\n--o0 Selamat datang di Ademin 0o--\n");

        Concert concert = new Concert(50); // Jumlah Tiket Awal
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
                    // System.out.print("Masukkan Nomor Untuk Menambah Jumlah Tiket : ");
                    // int addTickets = scanner.nextInt();
                    // System.out.println();
                    // concert.increaseTickets(addTickets);
                    // System.out.println();
                    Dito run = new Dito();
                    ArrayList<Konser> daftarKonser = run.getDaftarKonser();
                    ArrayList<Tiket> riwayatTiket = run.getDaftar();

                    run.viewKonser(daftarKonser);
                    tambahTiket();

                    break;

                case 2:
                    System.out.print("Masukkan Nomor Untuk Mengurangi Jumlah Tiket: ");
                    int removeTickets = scanner.nextInt();
                    concert.decreaseTickets(removeTickets);
                    // Jumlah Tiket Awal

                    break;

                case 3:
                    System.out.println("\nTiket Yang Tersedia : " + Dito.getJumlah());
                    break;

                case 4:
                    loop = false;
                    // System.out.print("Sedang keluar...");

                    // // Implementasi loading sebelum keluar
                    // for (int i = 0; i < 5; i++) {
                    // try {
                    // Thread.sleep(1000); // Menunggu 0.5 detik
                    // System.out.print(".");
                    // } catch (InterruptedException e) {
                    // e.printStackTrace();
                    // }
                    // }

                    // // Menampilkan pesan selesai keluar
                    // System.out.println("\nTerima kasih. Selamat tinggal - Sampai jumpa kembali :)
                    // ");
                    break;
                case 0:
                    System.out.println("0. Menutup Apliksai\n");
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

    public static void tambahTiket() {
        Dito run = new Dito();
        ArrayList<Konser> daftarKonser = run.getDaftarKonser();
        ArrayList<Tiket> riwayatTiket = run.getDaftar();

        Scanner input = new Scanner(System.in);

        // Your existing code here...

        // Ambil pilihan konser dari pengguna
        System.out.print("Pilih konser (0-" + (daftarKonser.size() - 1) + "): ");
        int pilihanKonser = input.nextInt();

        if (pilihanKonser == 0) {
            System.out.println("Terima kasih. Selamat tinggal!");
            return; // Keluar dari metode jika pilihan 0
        }

        if (pilihanKonser >= 1 && pilihanKonser <= daftarKonser.size()) {
            Konser konserPilihan = daftarKonser.get(pilihanKonser - 1);
            riwayatTiket = konserPilihan.getDaftarTiket();

            System.out.println("\nDaftar Tiket untuk => " + konserPilihan.getNamaKonser() + " :\n");

            // Menampilkan dan memperbarui stok tiket
            for (int i = 0; i < riwayatTiket.size(); i++) {
                Tiket tiket = riwayatTiket.get(i);
                System.out
                        .println(tiket.getJenis() + " - Rp " + tiket.getHarga() + " (Stok: " + tiket.getJumlah() + ")");

                // Tambah stok tiket
                int tambahanStok = 10;
                int stokBaru = tiket.getJumlah() + tambahanStok;
                tiket.setJumah(stokBaru);
            }

            // Pilih jenis tiket
            System.out.println("0. Tidak beli tiket");
            System.out.print("Pilih jenis tiket (1-" + riwayatTiket.size() + ") : ");
            int pilihanTiket = input.nextInt();

            if (pilihanTiket == 0) {
                System.out.println("Anda memilih untuk tidak membeli tiket. Terima kasih!");
                return; // Keluar dari metode jika pilihan 0
            }

            if (pilihanKonser >= 1 && pilihanKonser <= daftarKonser.size()) {
                konserPilihan = daftarKonser.get(pilihanKonser - 1);
                riwayatTiket = konserPilihan.getDaftarTiket();

                System.out.println("\nDaftar Tiket untuk o=> " + konserPilihan.getNamaKonser() + " :\n");
                for (int i = 0; i < riwayatTiket.size(); i++) {
                    Tiket tiket = riwayatTiket.get(i);
                    System.out.println(tiket.getJenis() + " - Rp " + tiket.getHarga() + " (Stok: "
                            + tiket.getJumlah() + ")");

                    int tiketTambah = tiket.getJumlah();

                    int coba = tiketTambah + 10;

                    System.out.println(coba);

                    tiket.setJumah(coba);
                }
            }

            System.out.println("0. Tidak beli tiket");
            System.out.println();
            System.out.print("Pilih jenis tiket (1-" + riwayatTiket.size() + ") : ");
            pilihanTiket = input.nextInt();
            System.out.println();

            if (pilihanTiket == 0) {
                System.out.println("Anda memilih untuk tidak membeli tiket. Terima kasih!");
                return; // Keluar dari loop jika pilihan 0
            }
        } else {
            System.out.println("Pilihan konser tidak valid.");
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
                Thread.sleep(1000); // Sleep for 1 second
            }
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

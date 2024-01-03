package Project1.ParengSambat;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.StringTokenizer;

import Project1.RevisiProject.JanganBesar.*;

import Sekedar.login;

class User {
    private String username;
    private String password;
    private String role;

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }
}

class Tiket {
    private String jenis;
    private String namaKonser;
    private int harga;
    private int jumlah;

    public Tiket(String jenis, String namaKonser, int harga, int jumlah) {
        this.jenis = jenis;
        this.namaKonser = namaKonser;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public String getJenis() {
        return jenis;
    }

    public String getNamaKonser() {
        return namaKonser;
    }

    public int getHarga() {
        return harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setStok(int StokBaru){
        this.jumlah = StokBaru;
    }

    public void kurangiJumlah(int jumlah) {
        if (jumlah <= this.jumlah) {
            this.jumlah -= jumlah;
        } else {
            System.out.println("Stok tidak mencukupi.");
        }
    }
}

class Konser {
    private String namaKonser;
    private ArrayList<Tiket> daftarTiket;

    public Konser(String namaKonser) {
        this.namaKonser = namaKonser;
        this.daftarTiket = new ArrayList<>();
    }

    public void tambahTiket(String jenis, int harga, int jumlah) {
        Tiket tiket = new Tiket(jenis, this.namaKonser, harga, jumlah);
        this.daftarTiket.add(tiket);
    }

    public String getNamaKonser() {
        return namaKonser;
    }

    public ArrayList<Tiket> getDaftarTiket() {
        return daftarTiket;
    }
}

public class Run {
          // Inisialisasi data konser
    ArrayList<Konser> daftarKonser = new ArrayList<>();

    public static void main(String[] args) throws IOException {
  
        
        Run run = new Run();
        while (true) {
            run.login();
        }

    }

    public void login() throws IOException {
        
// Opsi "0" sebagai keluar dari
        Konser Tulus_Album_Manusia = new Konser("1. Tulus - Album Manusia");
        Tulus_Album_Manusia.tambahTiket("1.Reguler", 50000, 50);
        Tulus_Album_Manusia.tambahTiket("2.VIP", 100000, 30);
        Tulus_Album_Manusia.tambahTiket("3.VVIP", 150000, 20);
        daftarKonser.add(Tulus_Album_Manusia);

        Konser Coldplay_Tour_Indonesia = new Konser("2. Coldplay - Tour in Indonesia");
        Coldplay_Tour_Indonesia.tambahTiket("1.Reguler", 50000, 50);
        Coldplay_Tour_Indonesia.tambahTiket("2.VIP", 100000, 30);
        Coldplay_Tour_Indonesia.tambahTiket("3.VVIP", 150000, 20);
        daftarKonser.add(Coldplay_Tour_Indonesia);

        Konser JKT_48_12_Tahun_Aniversary = new Konser("3. JKT 48 - 12 Tahun Aniveersary");
        JKT_48_12_Tahun_Aniversary.tambahTiket("1.Reguler", 50000, 50);
        JKT_48_12_Tahun_Aniversary.tambahTiket("2.VIP", 100000, 30);
        JKT_48_12_Tahun_Aniversary.tambahTiket("3.VVIP", 150000, 20);
        daftarKonser.add(JKT_48_12_Tahun_Aniversary);

        Konser Opick = new Konser("4. Opick - Bagaimana Meningkatkan iman agar dekat dengan tuhan");
        Opick.tambahTiket("1.Reguler", 50000, 50);
        Opick.tambahTiket("2.VIP", 100000, 30);
        Opick.tambahTiket("3.VVIP", 150000, 20);
        daftarKonser.add(Opick);

        Konser Habib_Syech = new Konser("5. Habib Syech - berkah sholawat tahun baru cerah");
        Habib_Syech.tambahTiket("1.Reguler", 50000, 50);
        Habib_Syech.tambahTiket("2.VIP", 100000, 30);
        Habib_Syech.tambahTiket("3.VVIP", 150000, 20);
        daftarKonser.add(Habib_Syech);

        // opsi untuk keluar
        daftarKonser.add(new Konser("0. Keluar"));
        // Tambahkan konser lain jika diperlukan


        Scanner input = new Scanner(System.in);

        // Inisialisasi ArrayList untuk menyimpan data user
        ArrayList<User> userDatabase = new ArrayList<>();
        userDatabase.add(new User("user1", "USR1", "customer"));
        userDatabase.add(new User("admin1", "cok", "admin"));
        
        boolean loginBerhasil = false;
        int percobaanLogin = 0;
        while (!loginBerhasil) {
        clearScreen();
        System.out.println("\t---------------------------------------------------------");
        System.out.println("\t >---> SELAMAT DATANG DI APLIKASI KONSER kELOMPOK 4 <---<");
        System.out.println("\t---------------------------------------------------------");
        Pembuka.tampilkanIsiFile("src\\Project1\\ParengSambat\\Muqodimah.txt");

        // Loop untuk meminta ulang input username dan password jika login gagal
            System.out.print("Masukkan username: ");
            String inputUsername = input.nextLine();

            System.out.print("Masukkan password: ");
            String inputPassword = input.nextLine();

            // Proses login
            for (User user : userDatabase) {
                if (inputUsername.equals(user.getUsername()) && inputPassword.equals(user.getPassword())) {
                    System.out.println("\n[ Login berhasil ]\n");
                    if (user.getRole().equals("admin")) {
                        Adminya admin = new Adminya();
                        admin.showMenuAdmin(daftarKonser);
                    } else if (user.getRole().equals("customer")) {
                        displayCustomerMenu();
                    }

                    loginBerhasil = true;
                }
            }
                    
             if (!loginBerhasil) {
                percobaanLogin++;
                System.out.println("\n[ Login gagal ]\n");
                System.out.println("Username atau password salah, Mohon Masukkan dengan benar. Percobaan: " + percobaanLogin + "\n");

                if (percobaanLogin < 3) {
                    System.out.print("Apakah Anda ingin mencoba login lagi? (ya/tidak): ");
                    String cobaLagi = input.nextLine().toLowerCase();
                    System.out.println();

                    if (!cobaLagi.equals("ya")) {
                        System.out.println("Terima kasih. Selamat tinggal - Sampai jumpa kembali :) ");
                        System.out.print("Sedang keluar...");

                        // Implementasi loading sebelum keluar
                        for (int i = 0; i < 5; i++) {
                            try {
                                Thread.sleep(500); // Menunggu 0.5 detik
                                System.out.print(".");
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                        // Menampilkan pesan selesai keluar
                        System.out.println("\nTerima kasih. Selamat tinggal - Sampai jumpa kembali :) ");
                        lihatRiwayatPembelian();
                        CloseAPK();
                        System.exit(0);
                    }
                } else {
                    System.out.println("[ MAAF ]");
                    System.out.println("Terlalu banyak percobaan login. Keluar...\n");
                    System.exit(0);
                }
                }
            }

        }
    

    ArrayList<Tiket> riwayatTiket = new ArrayList<>();

    public void riwayat() {
        if (riwayatTiket.isEmpty()) {
            System.out.println("Riwayat pembelian tiket kosong.");
        } else {
            System.out.println("Riwayat Pembelian Tiket:");
            System.out.println();
            for (int i = 0; i < riwayatTiket.size(); i++) {
                Tiket tiket = riwayatTiket.get(i);
                System.out.println("Konser       : " + tiket.getNamaKonser());
                System.out.println("Jenis Tiket  : " + tiket.getJenis());
                System.out.println("Harga Tiket  : Rp " + tiket.getHarga());
                System.out.println("Jumlah Tiket : " + tiket.getJumlah());
                System.out.println("Total Harga  : Rp " + (tiket.getHarga() * tiket.getJumlah()));
                System.out.println("------------------------------");

            }
        }
    }

    public void konseran() {
        // Input pilihan konser
        Scanner input = new Scanner(System.in);

        do {
            System.out.println(" Menu Beli Tiket Konser : \n");
            for (int i = 0; i < daftarKonser.size(); i++) {
                System.out.println(daftarKonser.get(i).getNamaKonser());
            }

            System.out.println();
            System.out.print("Pilih konser (0-" + (daftarKonser.size() - 1) + "): ");
            int pilihanKonser = input.nextInt();

            if (pilihanKonser == 0) {
                System.out.println("\nTerima kasih. Selamat tinggal! \n");
                break; // Keluar dari loop jika pilihan 0
            }

            if (pilihanKonser >= 1 && pilihanKonser <= daftarKonser.size()) {
                Konser konserPilihan = daftarKonser.get(pilihanKonser - 1);
                ArrayList<Tiket> daftarTiketKonser = konserPilihan.getDaftarTiket();

                System.out.println("\nDaftar Tiket untuk o=> " + konserPilihan.getNamaKonser() + " :\n");
                for (int i = 0; i < daftarTiketKonser.size(); i++) {
                    Tiket tiket = daftarTiketKonser.get(i);
                    System.out.println(tiket.getJenis() + " - Rp " + tiket.getHarga() + " (Stok: "
                            + tiket.getJumlah() + ")");
                }

                // System.out.println();
                // System.out.print("Pilih jenis tiket (0-" + daftarTiketKonser.size() + ") :
                // ");
                // System.out.println();

                System.out.println("0. Tidak beli tiket");
                System.out.println();
                System.out.print("Pilih jenis tiket (1-" + daftarTiketKonser.size() + ") : ");
                int pilihanTiket = input.nextInt();
                System.out.println();

                if (pilihanTiket == 0) {
                    System.out.println("Anda memilih untuk tidak membeli tiket. Terima kasih!");
                    break; // Keluar dari loop jika pilihan 0
                }

                if (pilihanTiket >= 1 && pilihanTiket <= daftarTiketKonser.size()) {
                    Tiket tiketPilihan = daftarTiketKonser.get(pilihanTiket - 1);

                    System.out.println("Stok Tiket    :" + "      o=> " + tiketPilihan.getNamaKonser() + " <=o\n"
                            + tiketPilihan.getJenis() + " tersisa : " + tiketPilihan.getJumlah());

                    System.out.println();
                    System.out.print("Masukkan jumlah tiket yang akan dibeli : ");
                    int jumlahBeli = input.nextInt();
                    System.out.println();

                    if (jumlahBeli > 0 && jumlahBeli <= tiketPilihan.getJumlah()) {
                        int totalHarga = tiketPilihan.getHarga() * jumlahBeli;
                        System.out.println("Total Harga untuk " + jumlahBeli + " tiket : \n"
                                + tiketPilihan.getJenis() + ": Rp " + totalHarga);

                        System.out.println();
                        System.out.print("Masukkan jumlah uang yang dibayarkan : Rp ");
                        int jumlahBayar = input.nextInt();

                        if (jumlahBayar >= totalHarga) {
                            int kembalian = jumlahBayar - totalHarga;
                            tiketPilihan.kurangiJumlah(jumlahBeli);

                            System.out.println("Kembalian: Rp " + kembalian);
                            System.out.println("\n[ Transaksi Berhasil ]\n");
                            System.out.println("Terimakasih atas kunjungannya.");
                            Tiket tiket = new Tiket(tiketPilihan.getJenis(), tiketPilihan.getNamaKonser(), totalHarga,
                                    jumlahBeli);
                            riwayatTiket.add(tiket);


                            // Tampilkan stok tiket setelah transaksi
                            System.out.println("Stok Tiket " + tiketPilihan.getNamaKonser() + " - "
                                    + tiketPilihan.getJenis() + " tersisa: " + tiketPilihan.getJumlah());

                            System.out.print("\nApakah Anda ingin membeli tiket konser lain? (ya/tidak) : ");
                            String lanjutBeli = input.next().toLowerCase();
                            System.out.println();

                            if (lanjutBeli.equals("ya")) {
                                continue;
                            } else {
                                System.out.println("\nTerima kasih, Sampai jumpa kembali.\n");
                                displayCustomerMenu(); // Tambahkan ini untuk kembali ke menu customer
                                break; // Tambahkan ini agar keluar dari loop setelah kembali ke menu customer
                            }

                        } else {
                            System.out.println("Pembayaran tidak mencukupi.");
                        }
                        System.out.println("\nTerimakasih anda telah beli tiket\n");
                    } else {
                        System.out.println("Jumlah tiket yang dibeli tidak valid.");
                        System.out.println();
                        System.out.print("Apakah Anda ingin mencoba membeli tiket lagi? (ya/tidak) : ");
                        String cobaLagi = input.next().toLowerCase();
                        System.out.println();

                        if (cobaLagi.equals("ya")) {
                            // Continue the loop to let the user try again
                            continue;
                        } else {
                            // Exit the loop and return to the customer menu
                            System.out.println("\nTerima kasih, Sampai jumpa kembali.\n");
                            displayCustomerMenu();
                            break;
                        }
                    }
                } else {
                    System.out.println("Pilihan tiket tidak valid.");
                }
            } else {
                System.out.println("Pilihan konser tidak valid.");
            }
        } while (true);
        displayCustomerMenu();
    }

    public void displayCustomerMenu() {
        Scanner input = new Scanner(System.in);
        // int pilihan = 0;
        boolean pilihan = true;
        boolean yakin = true;
        String pilihanUser;

        System.out.println("---o0 Selamat datang di menu user 0o--- ");

        while (pilihan) {
            System.out.println("\nMenu customer : ");
            System.out.println("1. Lihat jadwal event Konser");
            System.out.println("2. beli Tiket Konser");
            System.out.println("3. Lihat riwayat pembelian Tiket Konser");
            System.out.println("4. Logout");
            System.out.println("0. Keluar aplikasi");

            System.out.print("\nPilihan anda :");
            pilihanUser = input.nextLine();
            System.out.println();

            switch (pilihanUser) {
                case "1":
                    System.out.println("1. Lihat jadwal event Konser\n");
                    try {
                        tampilkanData();

                    } catch (Exception e) {
                        System.err.println("Maaf terjadi kesalahan..!!" + e.getMessage());
                    }
                    break;
                case "2":
                    System.out.println("\n2. Beli Tiket konser\n");
                    konseran();
                    break;
                case "3":
                    System.out.println("3. Lihat riwayat pembelian Tiket Konser");
                    riwayat();
                    break;
                case "4":
                    pilihan = false;
                    // System.out.println("0. Menutup Aplikasi");
                    // System.out.println();
                    // System.out.print("Menutup aplikasi");
                    // loadingMessage();
                    // lihatRiwayatPembelian();
                    // CloseAPK();
                    // System.exit(0);
                    break;
                case "0":
                    System.out.println("0. Menutup Apliksai\n");
                    System.out.print("sedang menutup aplikasi ");
                    loadingMessage();
                    CloseAPK();
                    System.exit(0);

                default:
                    System.err.println("Maaf... Pilihan anda tidak ada pilih [1 - 2] : ");
                    break;
            }

            // yakin = getYesorNo("Apakah anda ingin melanjutkan.?");
            // if (!yakin) {
            // System.out.println("\nTerimakasih atas Kunjungan anda. :) \n");
            // System.out.print("Menutup aplikasi");
            // loadingMessage();
            // pilihan = false;
            // }
        }

    }

    private void loadingMessage() {
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

    public static boolean pilihYesatauNO2(String messeage) {

        Scanner stasiunInput = new Scanner(System.in);

        System.out.print("\n" + messeage + " [y/n] : ");
        String pilihanUser = stasiunInput.next();
        while (!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")) {
            System.err.println("Maaf pilihan ana bukan y dan n");
            System.out.print("\n" + messeage + " [y/n] : ");
            pilihanUser = stasiunInput.next();
        }

        if (pilihanUser.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean pilihYesatauNO1(String messeage) {

        Scanner stasiunInput = new Scanner(System.in);

        System.out.print("\n" + messeage + " [y/n] : ");
        String pilihanUser = stasiunInput.next();
        while (!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")) {
            System.err.println("Maaf pilihan ana bukan y dan n");
            System.out.print("\n" + messeage + " [y/n] : ");
            pilihanUser = stasiunInput.next();
        }

        if (pilihanUser.equalsIgnoreCase("y")) {
            return true;
        } else {
            displayCustomerMenu();
            return false;
        }
    }

    public static void CloseAPK() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        } catch (Exception e) {
            System.err.println("Terjadi kesalahan: " + e);
        }

    }

    private static boolean pilihYesatauNO(String pertanyaan) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print(pertanyaan + " (yes/no): ");
            String jawaban = input.next().toLowerCase();

            if (jawaban.equals("yes")) {
                return true;
            } else if (jawaban.equals("no")) {
                return false;
            } else {
                System.out.println("Pilihan tidak valid. Silakan masukkan 'yes' atau 'no'.");
            }
        }
    }

    private static void lihatRiwayatPembelian() {
        // Logika untuk melihat riwayat pembelian
        System.out.println("Menampilkan riwayat pembelian...");
    }

    public static void tampilkanData() throws IOException {

        FileReader fileInput;
        BufferedReader bufferInput;

        try {
            fileInput = new FileReader("src\\Project1\\ParengSambat\\Info_Konser.txt");
            bufferInput = new BufferedReader(fileInput);
        } catch (Exception e) {
            System.err.println("Database Tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahoeloe");
            return;
        }

        System.out.println("\n| No |\t     Nama Konser\t\t\t                       |\tTempat        |\t     Waktu       ");
        System.out.println(
                "----------------------------------------------------------------------------------------------------------");

        String data = bufferInput.readLine();
        int nomorData = 0;
        while (data != null) {
            nomorData++;

            StringTokenizer stringToken = new StringTokenizer(data, ",");

            stringToken.nextToken();
            System.out.printf("| %2d ", nomorData);
            System.out.printf("|\t%3s  ", stringToken.nextToken());
            System.out.printf("|\t%3s   ", stringToken.nextToken());
            System.out.printf("|\t%3s    ", stringToken.nextToken());
            System.out.print("\n");

            data = bufferInput.readLine();
        }

        System.out.println(
                "----------------------------------------------------------------------------------------------------------");
    }

    public static void tampilkanIsiFile(String filePath) throws IOException {
        // Gunakan Paths.get() untuk membuat objek Path dari path file
        Path path = Paths.get(filePath);

        // Gunakan Files.readAllLines() untuk membaca semua baris dari file ke dalam
        // List
        List<String> baris = Files.readAllLines(path);

        // Tampilkan setiap baris di konsol
        for (String line : baris) {
            System.out.println(line);
        }
    }

    public static void displayAdminMenu() {
        // ga ono.?
    }

    public static void clearScreen() {
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



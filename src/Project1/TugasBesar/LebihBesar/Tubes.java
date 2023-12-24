package Project1.TugasBesar.LebihBesar;

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
    private int harga;
    private int jumlah;

    public Tiket(String jenis, int harga, int jumlah) {
        this.jenis = jenis;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public String getJenis() {
        return jenis;
    }

    public int getHarga() {
        return harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void kurangiJumlah(int jumlah) {
        if (jumlah <= this.jumlah) {
            this.jumlah -= jumlah;
        } else {
            System.out.println("Stok tidak mencukupi.");
        }
    }
}

public class Tubes {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        // Inisialisasi ArrayList untuk menyimpan data user
        ArrayList<User> userDatabase = new ArrayList<>();

        clearScreen();
        System.out.println("\t---------------------------------------------------------");
        System.out.println("\t >---> SELAMAT DATANG DI APLIKASI KONSER kELOMPOK 4 <---<");
        System.out.println("\t---------------------------------------------------------");
        Pembuka.tampilkanIsiFile("D:\\My Repo\\Belajar\\src\\Project1\\TugasBesar\\LebihBesar\\Muqodimah.txt");

        userDatabase.add(new User("user1", "USR1", "customer"));
        userDatabase.add(new User("admin1", "cok", "admin"));

        System.out.print("Masukkan username: ");
        String inputUsername = input.nextLine();

        System.out.print("Masukkan password: ");
        String inputPassword = input.nextLine();

        // Proses login
        User loggedInUser = null;
        for (User user : userDatabase) {
            if (inputUsername.equals(user.getUsername()) && inputPassword.equals(user.getPassword())) {
                if (user.getRole().equals("admin")) {
                    Data.showMenuAdmin();
                    break;
                } else {
                    loggedInUser = user;
                    break;
                }
            }
        }

        if (loggedInUser != null) {
            System.out.println("\n[Login berhasil..] ");
            System.out.println("\n--o0 Selamat datag di aplikasi kami 0o--");
            if (loggedInUser.getRole().equals("customer")) {
                displayCustomerMenu();
                // Lakukan aksi untuk customer
            } else if (loggedInUser.getRole().equals("admin")) {
                displayAdminMenu();
                // Lakukan aksi untuk admin
            }
        } else {
            System.out.println("Login gagal! Username atau password salah.");
        }
    }

    public static void displayCustomerMenu() {
        Scanner input = new Scanner(System.in);
        // int pilihan = 0;
        boolean pilihan = true;
        boolean yakin = true;
        String pilihanUser;

        while (pilihan) {
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
                    try {
                        tampilkanData();

                    } catch (Exception e) {
                        System.err.println("Maaf terjadi kesalahan..!!" + e.getMessage());
                    }
                    break;
                case "2":
                    System.out.println("2. Beli Tiket konser");
                    beliTiket();
                    break;
                case "3":
                    System.out.println("3. Lihat riwayat pembelian Tiket Konser");
                    // riwayat pembelian tiket konser
                    break;
                case "0":
                    System.out.println("0. Menutup Aplikasi");
                    lihatRiwayatPembelian();
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

    private static boolean pilihYesatauNO(String messeage) {

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

    private static void beliTiket() {
        // Logika untuk membeli tiket
        ArrayList<Tiket> daftarTiket = new ArrayList<>();
        daftarTiket.add(new Tiket("Reguler", 50000, 50));
        daftarTiket.add(new Tiket("VIP", 100000, 30));
        daftarTiket.add(new Tiket("VVIP", 150000, 20));

        // Input pilihan tiket
        Scanner input = new Scanner(System.in);
        System.out.println("Daftar Tiket:");
        for (int i = 0; i < daftarTiket.size(); i++) {
            Tiket tiket = daftarTiket.get(i);
            System.out.println((i + 1) + ". " + tiket.getJenis() + " - Rp " + tiket.getHarga() + " (Stok: "
                    + tiket.getJumlah() + ")");
        }

        System.out.print("Pilih jenis tiket (1-3): ");
        int pilihanTiket = input.nextInt();

        // Input jumlah tiket yang akan dibeli
        System.out.print("Masukkan jumlah tiket yang akan dibeli: ");
        int jumlahBeli = input.nextInt();

        // Validasi pilihan tiket
        if (pilihanTiket >= 1 && pilihanTiket <= daftarTiket.size()) {
            Tiket tiketPilihan = daftarTiket.get(pilihanTiket - 1);

            // Validasi jumlah tiket yang akan dibeli
            if (jumlahBeli > 0 && jumlahBeli <= tiketPilihan.getJumlah()) {
                // Hitung total harga
                int totalHarga = tiketPilihan.getHarga() * jumlahBeli;
                System.out.println("Total Harga: Rp " + totalHarga);

                // Input pembayaran
                System.out.print("Masukkan jumlah uang yang dibayarkan: Rp ");
                int jumlahBayar = input.nextInt();

                // Validasi pembayaran
                if (jumlahBayar >= totalHarga) {
                    // Proses transaksi
                    int kembalian = jumlahBayar - totalHarga;
                    tiketPilihan.kurangiJumlah(jumlahBeli);

                    System.out.println("Transaksi Berhasil!");
                    System.out.println("Terima kasih telah berbelanja.");
                    System.out.println("Kembalian: Rp " + kembalian);

                    // Tampilkan stok tiket setelah transaksi
                    System.out
                            .println("Stok Tiket " + tiketPilihan.getJenis() + " tersisa: " + tiketPilihan.getJumlah());
                } else {
                    System.out.println("Pembayaran tidak mencukupi.");
                }
            } else {
                System.out.println("Jumlah tiket yang dibeli tidak valid.");
            }
        } else {
            System.out.println("Pilihan tiket tidak valid.");
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
            fileInput = new FileReader("src\\Project1\\TugasBesar\\LebihBesar\\Info_Konser.txt");
            bufferInput = new BufferedReader(fileInput);
        } catch (Exception e) {
            System.err.println("Database Tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahoeloe");
            return;
        }

        System.out.println("\n| No |\t     Nama Konser                 |\tTempat        |\t     Waktu       ");
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

    class costumer {

    }

    class ademin {
        private int availableTickets;

        public ademin(int initialTickets) {
            this.availableTickets = initialTickets;
        }

        public int getAvailableTickets() {
            return availableTickets;
        }

        public void increaseTickets(int amount) {
            if (amount > 0) {
                availableTickets += amount;
                System.out.println(amount + " tiket ditambahkan. \n\nTotal tiket adalah : " + " " + availableTickets);
                System.out.println();
            } else {
                System.out.println("Input tidak valid.");
            }
        }

        public void decreaseTickets(int amount) {
            if (amount > 0 && amount <= availableTickets) {
                availableTickets -= amount;
                System.out
                        .println(amount + " tiket dihapus. \n\nTotal tiket yang tersedia : " + " " + availableTickets);
                System.out.println();
            } else {
                System.out.println("\nMaaf . . .");
                System.out.println(
                        "Jumlah tiket yang akan dihapus tidak valid atau tiket yang tersedia tidak mencukupi.\n");
            }
        }
    }
}

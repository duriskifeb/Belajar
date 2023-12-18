package Project1;

import java.util.Scanner;
import java.util.ArrayList;

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

public class Konser2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Inisialisasi ArrayList untuk menyimpan data user
        ArrayList<User> userDatabase = new ArrayList<>();
        userDatabase.add(new User("user1", "password1", "customer"));
        userDatabase.add(new User("admin1", "adminpassword1", "admin"));

        System.out.print("Masukkan username: ");
        String inputUsername = input.nextLine();

        System.out.print("Masukkan password: ");
        String inputPassword = input.nextLine();

        // Proses login
        User loggedInUser = null;
        for (User user : userDatabase) {
            if (inputUsername.equals(user.getUsername()) && inputPassword.equals(user.getPassword())) {
                loggedInUser = user;
                break;
            }
        }

        if (loggedInUser != null) {
            System.out.println("Login berhasil! Selamat datang, " + loggedInUser.getUsername());
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

    private static void displayCustomerMenu() {
        Scanner input = new Scanner(System.in);
        int pilihan = 0;
        do {
            System.out.println("Menu Customer:");
            System.out.println("1. Beli tiket");
            System.out.println("2. Lihat riwayat pembelian");
            System.out.println("3. Keluar");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    beliTiket();
                    break;
                case 2:
                    lihatRiwayatPembelian();
                    break;
                // Tambahkan opsi menu tambahan untuk customer
                case 3:
                    System.out.println("Keluar dari menu customer");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 3);
    }

    public static void displayAdminMenu() {
        System.out.println("Menu Admin:");
        System.out.println("1. Kelola pengguna");
        System.out.println("2. Kelola tiket");
        // Tambahkan opsi menu tambahan untuk admin
    }

    private static void beliTiket() {
        // Logika untuk membeli tiket
        System.out.println("Proses pembelian tiket...");
    }

    private static void lihatRiwayatPembelian() {
        // Logika untuk melihat riwayat pembelian
        System.out.println("Menampilkan riwayat pembelian...");
    }
}

class Konser {
    // Kelas Konser di sini
    // ... (tidak perlu diubah karena tidak ada kesalahan pada bagian ini)
}

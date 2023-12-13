package Project1;

import java.util.ArrayList;
import java.util.Scanner;

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

public class Konser {
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

    public static void displayCustomerMenu() {
        System.out.println("Menu Customer:");
        System.out.println("1. Beli tiket");
        System.out.println("2. Lihat riwayat pembelian");
        // Tambahkan opsi menu tambahan untuk customer
    }

    public static void displayAdminMenu() {
        System.out.println("Menu Admin:");
        System.out.println("1. Kelola pengguna");
        System.out.println("2. Kelola tiket");
        // Tambahkan opsi menu tambahan untuk admin
    }
}

class Konser {
    String Namakonser;
    int jadwal;
    String Tempat;

    public Konser(String Namakonser, int jadwal, String Tempat) {
        this.Namakonser = Namakonser;
        this.jadwal = jadwal;
        this.Tempat = Tempat;

    }

    public String getNamakonser() {
        return Namakonser;
    }
   
   
    public String getTempat() {
        return Tempat;
    }
    

    
}

package Project1.TugasBesar;

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

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Inisialisasi ArrayList untuk menyimpan data user
        ArrayList<User> userDatabase = new ArrayList<>();
        userDatabase.add(new User("user1", "USR1", "customer"));
        userDatabase.add(new User("admin1", "ADM1", "admin"));

        System.out.print("Masukkan username: ");
        String inputUsername = input.nextLine();

        System.out.print("Masukkan password: ");
        String inputPassword = input.nextLine();

        // Proses login
        User loggedInUser = null;
        for (User user : userDatabase) {
            if (inputUsername.equals(user.getUsername()) && inputPassword.equals(user.getPassword())) {
                if (user.getRole().equals("admin")) {
                    Database.showMenu();
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

    

    private static void displayCustomerMenu() {
        Scanner input = new Scanner(System.in);
        // int pilihan = 0;
        boolean pilihan = true;
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
                    System.out.println("1. Lihat jadwal event Konser");
                    beliTiket();
                    break;
                case "2":
                    System.out.println("2. Beli Tiket konser");
                    beliTiket();
                    break;
                case "3":
                    System.out.println("3. Lihat riwayat pembelian Tiket Konser");
                    beliTiket();
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
            }

        }

    
    public static void CloseAPK() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        } catch (Exception e) {
            System.err.println("Terjadi kesalahan: " + e);
        }

    }

    public static void showJadwalKonser() {
        Scanner konseran = new Scanner(System.in);

        System.out.println("Jadwal Konser yang akan hadir :");
        System.out.println("1. Tulus - Album Manusia ");
        System.out.println("2. Coldplay - cosplay/AldiTaher - ");
    }

    public static void displayAdminMenu() {
        System.out.println("\n[ Login Berhasil ...]");
        System.out.println("\nMenu Admin :\n");
        System.out.println("1. Kelola pengguna");
        System.out.println("2. Kelola tiket");
        // Tambahkan opsi menu tambahan untuk admin
    }

    private static void beliTiket() {
        // Logika untuk membeli tiket
        Scanner putin = new Scanner(System.in);


        System.out.println("Pilih Jenis Tiket Konser : ");
        System.out.println("1. Tiket Reguler");
        System.out.println("1. Tiket VIP");
        System.out.println("0. Tiket VVIP");

        System.out.print("Masukkan pilihan anda [1 - 2]");
        int milih = putin.nextInt();

        switch (milih) {
            case 1:
                System.out.println("Andah memilih tiket reguler");
                break;
            case 2:
                System.out.println("Andah memilih tiket reguler");
                break;
            case 0:
                System.out.println("Andah memilih tiket reguler");
                break;
        
            default:
                break;
        }
    }

    private static void showTiketReguler() {
        System.out.println("Isi tiket reguller : ");
        System.out.println("1. ");
        
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

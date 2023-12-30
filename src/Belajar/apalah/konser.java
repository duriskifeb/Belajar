package Belajar.apalah;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class konser {
    public static void main(String[] args) {
        konser run = new konser();
        run.runThis();

    }

    void runThis() {
        System.out.println(listTiket.listTiket.size());
        tambahTiket();
        System.out.println(listTiket.listTiket.size());
        
        

    }

    DataTiket listTiket = new DataTiket();
    void showList() {
        listTiket.listTiket.stream().iterator().forEachRemaining(
                tiket -> {
                    int jumlah = tiket.getJumlah();
                    int harga = tiket.getHarga();
                    String kode = tiket.getKode();
                    System.out.format("%10s %10s %10s", jumlah, harga, kode);
                    System.out.println();
                });
    }


    void tambahTiket() {
        DataTiket tiket = new DataTiket();

        Scanner input = new Scanner(System.in);

        System.out.println("TAMHAB TIKET");
        System.out.print("Jumlah\t: ");
        int jumlah = input.nextInt();
        input.nextLine();

        System.out.print("Harga\t: ");
        int harga = input.nextInt();
        input.nextLine();

        System.out.print("Kode\t: ");
        String kode = input.nextLine();

        tiket.addNewTiket(jumlah, harga, kode);;
    }
}

// datasource
class DataTiket {
    ArrayList<Tiket> listTiket = new ArrayList<>(
            Arrays.asList(
                    new Tiket(100, 100000, "DMasiv"),
                    new Tiket(200, 50000, "ST12"),
                    new Tiket(50, 300000, "Habib Syech")));

    void addNewTiket(int jumlah, int harga, String kode) {
        listTiket.add(new Tiket(jumlah, harga, kode));
    }

    // void jualTiket(int index, int jumlah){
    // listTiket.set(index, );
    // }

}

class DataUser {
    ArrayList<User> listUser = new ArrayList<>(
            Arrays.asList(
                    new User(
                            "admin",
                            "admin"),
                    new User(
                            "customer",
                            "customer")));
}

// model
class Tiket {
    int jumlah;
    int harga;
    String kode;

    Tiket(int jumlah, int harga, String kode) {
        this.jumlah = jumlah;
        this.harga = harga;
        this.kode = kode;
    }

    public int getHarga() {
        return harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public String getKode() {
        return kode;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
}

class User {
    String username;
    String password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class NamaKelasAnda {
    // Metode dan atribut yang sudah ada di sini...

    public void login() throws IOException {
        Scanner input = new Scanner(System.in);

        // Inisialisasi ArrayList untuk menyimpan data pengguna
        ArrayList<User> userDatabase = new ArrayList<>();
        userDatabase.add(new User("user1", "USR1", "customer"));
        userDatabase.add(new User("admin1", "cok", "admin"));

        boolean loginBerhasil = false;
        int percobaanLogin = 0;

        while (!loginBerhasil) {
            clearScreen();
            System.out.println("\t---------------------------------------------------------");
            System.out.println("\t >---> SELAMAT DATANG DI APLIKASI KONSER KELOMPOK 4 <---<");
            System.out.println("\t---------------------------------------------------------");
            Pembuka.tampilkanIsiFile("src\\Project1\\RevisiProject\\JanganBesar\\Muqodimah.txt");

            // Loop untuk meminta ulang input username dan password jika login gagal
            System.out.print("Masukkan username: ");
            String inputUsername = input.nextLine();

            System.out.print("Masukkan password: ");
            String inputPassword = input.nextLine();

            // Proses login
            for (User user : userDatabase) {
                if (inputUsername.equals(user.getUsername()) && inputPassword.equals(user.getPassword())) {
                    System.out.println("\n[ Login berhasil ]");
                    if (user.getRole().equals("admin")) {
                        Data.showMenuAdmin();
                    } else if (user.getRole().equals("customer")) {
                        displayCustomerMenu();
                    }

                    loginBerhasil = true;
                }
            }

            if (!loginBerhasil) {
                percobaanLogin++;
                System.out.println("\n[ Login gagal ]\n");
                System.out.println("Username atau password salah. Percobaan: " + percobaanLogin);

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
                                Thread.sleep(1000); // Menunggu 0.5 detik
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
                    System.out.println("Terlalu banyak percobaan login. Keluar...");
                    System.exit(0);
                }
            }
        }
    }

    // Metode-metode lainnya di sini...
}

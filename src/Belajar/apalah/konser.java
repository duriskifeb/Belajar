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
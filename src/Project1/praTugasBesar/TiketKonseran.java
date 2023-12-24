package Project1.praTugasBesar;

import java.util.ArrayList;
import java.util.Scanner;

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

    public void kurangiJumlah(int jumlah) {
        if (jumlah <= this.jumlah) {
            this.jumlah -= jumlah;
        } else {
            System.out.println("Stok tidak mencukupi.");
        }
    }
}

public class TiketKonseran {
    public static void main(String[] args) {
        // Inisialisasi data tiket
        ArrayList<Tiket> daftarTiket = new ArrayList<>();
        daftarTiket.add(new Tiket("Reguler", "Konser A", 50000, 50));
        daftarTiket.add(new Tiket("VIP", "Konser B", 100000, 30));
        daftarTiket.add(new Tiket("VVIP", "Konser C", 150000, 20));

        // Input pilihan tiket
        Scanner input = new Scanner(System.in);
        System.out.println("Daftar Tiket:");
        for (int i = 0; i < daftarTiket.size(); i++) {
            Tiket tiket = daftarTiket.get(i);
            System.out.println((i + 1) + ". " + tiket.getNamaKonser() + " - " + tiket.getJenis() + " - Rp " + tiket.getHarga() + " (Stok: " + tiket.getJumlah() + ")");
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
                    System.out.println("Stok Tiket " + tiketPilihan.getNamaKonser() + " - " + tiketPilihan.getJenis() + " tersisa: " + tiketPilihan.getJumlah());
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
}

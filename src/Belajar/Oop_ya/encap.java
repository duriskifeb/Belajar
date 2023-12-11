package Belajar.Oop_ya;

// Kelas Induk
public class encap {
    protected String merek;

    public encap(String merek) {
        this.merek = merek;
    }

    public void bergerak() {
        System.out.println("Kendaraan sedang bergerak.");
    }
}

// Kelas Anak
public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String merek, int jumlahPintu) {
        super(merek);
        this.jumlahPintu = jumlahPintu;
    }

    public void klakson() {
        System.out.println("Mobil berklakson.");
    }
}

// Contoh Penggunaan
public class encap {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Honda", 4);
        mobil.bergerak();
        mobil.klakson();
        System.out.println("Merek mobil: " + mobil.merek);
        System.out.println("Jumlah pintu: " + mobil.jumlahPintu);
    }
}

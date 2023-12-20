package Belajar.Oop_ya;

class Hewan {

    //prperti atau fields

    double tinggi = 30;
    double berat = 10;

    int umur;

    //iini adalah contruktor dengan parameter
    Hewan(int umur) {
        this.umur = umur;
    }

    void lari () {
        System.out.println("Berlari sangat cepat...");

    }

    void jalan () {
        System.out.println("Berjalan dengan");
    }
    
    void makan () {
        System.out.println("Berjalan dengan");
    }

    double getBerat() {
        return berat;
    }

    double getTinggi() {
        return berat;
    }

    double getUmur() {
        return berat;
    }
    
}

public class Fungction4 {

    public static void main(String[] args) {
        Hewan memeng = new Hewan('2');
        memeng.makan();
        memeng.jalan();
        memeng.lari();

        //contoh penggunaan fungsi getumur
        System.out.println("Umurnya adalah : " + memeng.getUmur());

        double apa = memeng.getBerat() / ((memeng.getTinggi() * 0.01) * (memeng.getTinggi() * 0.01));
        System.out.println("Indeks masa tubuhnya adalah " + apa);

        
    }
}


//seddikit catatan :
//Nilai balik adalah nilai yang dikirim oleh suatu fungsi..



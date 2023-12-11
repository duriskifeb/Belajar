package Belajar.Oop_ya;

public class memberCnth {
    // Atribut
    private String nama;
    private int umur;
    private String alamat;

    // Konstruktor
    public memberCnth(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    // Metode getter dan setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Metode lainnya
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Alamat: " + alamat);
    }

    public static void main(String[] args) {
        // Membuat objek member
        memberCnth member1 = new memberCnth("John Doe", 25, "Jl. Contoh No. 123");
        memberCnth member2 = new memberCnth("Mark MAnson", 40, "Jl. Pegangsaan TImur, jakarta Selatan");
        
        // Mengakses dan mengubah atribut menggunakan metode setter
        member1.setUmur(26);
        member2.setUmur(26);
        
        // Mengakses atribut menggunakan metode getter
        System.out.println("Nama: " + member1.getNama());
        System.out.println("Umur: " + member1.getUmur());
        System.out.println("Nama: " + member2.getNama());
        System.out.println("Umur: " + member2.getUmur());
        
        // Memanggil metode displayInfo
        member1.displayInfo();
        System.out.println();
        member2.displayInfo();
    }
}

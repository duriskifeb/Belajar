package Belajar.Oop_ya;
import java.util.Scanner;;
public class Hewan {
    public void cetakNama(String nama) {
        System.out.println("Nama hewan: " + nama);
    }
}

// Kelas Objek dipindahkan ke file terpisah dengan nama Objek.java

package Belajar.Oop_ya;

public class Objek {
    public static void main(String[] args) {
        // menciptakan object dengan nama 'objekHewan'
        Hewan objekHewan = new Hewan();
        objekHewan.cetakNama("Elang");
    }
}
